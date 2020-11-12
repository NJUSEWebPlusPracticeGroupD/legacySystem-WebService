package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.OrderEntity.*;
import com.example.oldCompanySystem.bl.OrderPort;
import com.example.oldCompanySystem.dao.CsvReader;
import com.sun.corba.se.spi.orb.ORBData;
import org.apache.cxf.staxutils.StaxUtils;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@WebService(name = "OrderPort", targetNamespace = "http://www.oldSystem.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class OrderPortImpl implements OrderPort {
    @PostConstruct
    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
    }

    public static ArrayList<String> fileLines = new CsvReader("csv/订单信息.csv").readCsv();
    public  static ArrayList<String> itemLines = new CsvReader("csv/物品信息.csv").readCsv();
    @Override
    public OrderList getAllOrders(String getAllOrdersParam) {
        OrderList res = new OrderList();
        List<OrderInfoType> orderInfoTypes = new ArrayList<OrderInfoType>();
        res.setOrderInfo(orderInfoTypes);
        int cnt = 0;
       for(String line:fileLines){
           if(cnt == 0){
               cnt++;
               continue;
           }
           String[] properties = line.split(",",-1);

           OrderInfoType orderInfoType = new OrderInfoType();
           setOrderInfo(orderInfoType,properties);
           orderInfoTypes.add(orderInfoType);
       }
       res.setOrderInfoTypes(new OrderInfoType[orderInfoTypes.size()]);
       int i=0;
       for(OrderInfoType o:orderInfoTypes){
           res.getOrderInfoTypes()[i] = o;
           i++;
       }
       System.out.println(res.getOrderInfo().size());
        return res;
    }

    @Override
    public OrderInfoType getOrderById(GetOrderByIdType getOrderByIdParam) throws OrderDoesNotExistFault {
        OrderInfoType res = new OrderInfoType();
        String id = getOrderByIdParam.getOrderId();
        int cnt = 0;
        boolean existed = false;
        for(String line:fileLines){
            if(cnt==0){
                cnt++;
                continue;
            }
            String[] properties = line.split(",",-1);
            if(properties[0].equals(id)){
                existed = true;
                setOrderInfo(res,properties);
            }
        }
        if(!existed){
            throw new OrderDoesNotExistFault("This order does not exist.",new OrderDoesNotExistFaultType());
        }else {
            return res;
        }

    }

    @Override
    public OrderList getOrdersByItemId(GetOrdersByItemIdType getOrdersByMaterielIdParam) throws ItemDoesNotExistFault {

        String id = getOrdersByMaterielIdParam.getItemId();
        boolean existed = false;
        for(String line:itemLines){
            String[] properties = line.split(",",-1);
            if(properties[0].equals(id)){
                existed = true;
                break;
            }
        }
//        if(!existed){
//            throw new ItemDoesNotExistFault("This item does not exist.",new ItemDoesNotExistFaultType());
//        }

        OrderList res = new OrderList();
        List<OrderInfoType> orderInfoTypes = new ArrayList<OrderInfoType>();
        res.setOrderInfo(orderInfoTypes);
        int cnt = 0;
        for(String line:fileLines){
            if(cnt==0){
                cnt++;
                continue;
            }
            String[] properties = line.split(",",-1);
            if(properties[1].equals(id)){
                OrderInfoType orderInfoType = new OrderInfoType();
                setOrderInfo(orderInfoType,properties);
                orderInfoTypes.add(orderInfoType);
            }
        }
        return res;

    }

    private void setOrderInfo(OrderInfoType orderInfoType,String[] properties){
        orderInfoType.setOrderId(properties[0]);
        orderInfoType.setItem(properties[1]);
        orderInfoType.setNumOfOrder(Integer.parseInt(properties[2]));

        String dateString = properties[3];
        Date date = null;
        try{
            date= new SimpleDateFormat("yyyy/MM/dd").parse(dateString);
        }
        catch (Exception e){
            e.printStackTrace();
            return;
        }
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar gc = null;
        try {
            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            gc.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
        } catch (Exception e) {

            e.printStackTrace();
        }

        orderInfoType.setTermOfDelivery(gc);
//        orderInfoType.setComment(properties[4]);
//        orderInfoType.setLength(properties[5]);
    }
}
