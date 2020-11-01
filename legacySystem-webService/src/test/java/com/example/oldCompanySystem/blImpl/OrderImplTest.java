package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.OrderEntity.*;
import com.example.oldCompanySystem.blImpl.OrderPortImpl;
import com.example.oldCompanySystem.dao.CsvReader;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class OrderImplTest {
    @Test
    void OrderImplTest1(){
        OrderPortImpl orderPort = new OrderPortImpl();
        OrderPortImpl.fileLines = new CsvReader("src/test/java/testData/订单信息.csv").readCsv();

        OrderList res = orderPort.getAllOrders("getAllOrders");

        Assert.assertEquals(5,res.getOrderInfo().size());
        Assert.assertEquals("764486",res.getOrderInfo().get(2).getOrderId());
    }

    @Test
    void OrderImplTest2() throws OrderDoesNotExistFault {
        OrderPortImpl orderPort = new OrderPortImpl();
        OrderPortImpl.fileLines = new CsvReader("src/test/java/testData/订单信息.csv").readCsv();

        GetOrderByIdType param = new GetOrderByIdType();
        param.setOrderId("418575");

        OrderInfoType res = orderPort.getOrderById(param);
        Assert.assertEquals("3246515",res.getItem());

    }

    @Test
    void OrderImplTest3(){
        OrderPortImpl orderPort = new OrderPortImpl();
        OrderPortImpl.fileLines = new CsvReader("src/test/java/testData/订单信息.csv").readCsv();

        GetOrderByIdType param = new GetOrderByIdType();
        param.setOrderId("418575");

        try{
            OrderInfoType res = orderPort.getOrderById(param);
        }
        catch (OrderDoesNotExistFault e){
            Assert.assertEquals("This order does not exist.",e.getMessage());
        }



    }

    @Test
    void OrderImplTest4() throws ItemDoesNotExistFault {
        OrderPortImpl orderPort = new OrderPortImpl();
        OrderPortImpl.fileLines = new CsvReader("src/test/java/testData/订单信息.csv").readCsv();
        OrderPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        GetOrdersByItemIdType param = new GetOrdersByItemIdType();
        param.setItemId("1413036");
        OrderList res = orderPort.getOrdersByItemId(param);
        Assert.assertEquals(2,res.getOrderInfo().size());
        Assert.assertEquals("764486",res.getOrderInfo().get(1).getOrderId());
        Assert.assertEquals("418006",res.getOrderInfo().get(0).getOrderId());

    }

    @Test
    void OrderImplTest5(){
        OrderPortImpl orderPort = new OrderPortImpl();
        OrderPortImpl.fileLines = new CsvReader("src/test/java/testData/订单信息.csv").readCsv();

        OrderPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        GetOrdersByItemIdType param = new GetOrdersByItemIdType();
        param.setItemId("00000");
        try{
            OrderList res = orderPort.getOrdersByItemId(param);
        }
        catch (ItemDoesNotExistFault e){
            Assert.assertEquals("This item does not exist.",e.getMessage());
        }


    }
}
