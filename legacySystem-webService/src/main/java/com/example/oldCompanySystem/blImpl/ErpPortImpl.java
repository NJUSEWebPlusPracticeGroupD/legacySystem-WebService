package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.ERPEntity.*;
import com.example.oldCompanySystem.bl.ErpPort;
import com.example.oldCompanySystem.dao.CsvReader;
import org.apache.cxf.staxutils.StaxUtils;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@WebService(name = "ErpPort", targetNamespace = "http://www.oldSystem.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class ErpPortImpl implements ErpPort {
    @PostConstruct
    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
    }

    public static ArrayList<String> resourceLines = new CsvReader("csv/资源.csv").readCsv();
    public static ArrayList<String> itemLines = new CsvReader("csv/物品信息.csv").readCsv();

    @Override
    public GroupInfoList getAllGroupInfos(String getAllGroupInfosParam) {
        System.out.println("ass");
        GroupInfoList res = new GroupInfoList();
        List<GroupInformationType> groupInformationTypes = new ArrayList<>();
        res.setGroupInfo(groupInformationTypes);

       for(int i=5;i<resourceLines.size();i++){

           String[] properties = resourceLines.get(i).split(",",-1);
           if(properties[2].equals("班组")){
               GroupInformationType groupInformationType = new GroupInformationType();
               setGroupProperties(groupInformationType,properties);
               groupInformationTypes.add(groupInformationType);
           }

       }


        return res;
    }

    @Override
    public GroupInformationType getGroupInfoById(GetGroupInfoByIdParamType getGroupInfoByIdParam) throws GroupDoesNotExistFault {
        GroupInformationType res = new GroupInformationType();
        String id = getGroupInfoByIdParam.getGroupId();
        boolean existed =false;
        for(int i=5;i<resourceLines.size();i++){
            String[] properties = resourceLines.get(i).split(",",-1);
            if(properties[2].equals("班组")&&id.equals(properties[1].substring(0,properties[1].indexOf("组")))){
                setGroupProperties(res,properties);
                existed = true;
                break;
            }
        }
        if(!existed){
            throw new GroupDoesNotExistFault("This group does not exist.",new GroupDoesNotExistFaultType());
        }
        else{
            return res;
        }

    }

    @Override
    public GroupInformationType getGroupInfoByMemberName(GetGroupInfoByMemberNameParamType getGroupInfoByMemberNameParam) throws GroupDoesNotExistFault {
        GroupInformationType res = new GroupInformationType();
        String name = getGroupInfoByMemberNameParam.getMemberName();
        boolean existed =false;
        for(int i=5;i<resourceLines.size();i++){
            String[] properties = resourceLines.get(i).split(",",-1);
            if(properties[2].equals("班组")&&(properties[1].substring(properties[1].indexOf("组")+1,properties[1].indexOf("（")).contains(name))){
                setGroupProperties(res,properties);
                existed = true;
                break;
            }
        }
        if(!existed){
            throw new GroupDoesNotExistFault("This group does not exist.",new GroupDoesNotExistFaultType());
        }
        else{
            return res;
        }
    }

    @Override
    public MachineInfoList getAllMachineInfos(String getAllMachineInfosParam) {
        MachineInfoList res = new MachineInfoList();
        List<MachineInfoType> machineInfoTypes = new ArrayList<>();
        res.setMachineInfo(machineInfoTypes);

        for(int i=5;i<resourceLines.size();i++){

            String[] properties = resourceLines.get(i).split(",",-1);
            if(properties[2].equals("线体")||properties[2].equals("设备")){
                MachineInfoType machineInfoType = new MachineInfoType();
                setMachineProperties(machineInfoType,properties);
                machineInfoTypes.add(machineInfoType);
            }

        }


        return res;


    }

    @Override
    public MachineInfoType getMachineInfoByName(GetMachineInfoByNameParamType getMachineInfoByNameParam) throws MachineDoesNotExistFault {
        MachineInfoType res = new MachineInfoType();
        String name = getMachineInfoByNameParam.getMachineName();
        boolean existed = false;

        for(int i=5;i<resourceLines.size();i++){
            String[] properties = resourceLines.get(i).split(",",-1);
            if((properties[2].equals("设备")||properties[2].equals("线体"))&&name.equals(properties[1])){
                setMachineProperties(res,properties);
                existed = true;
            }
        }
        if(!existed){
            throw new MachineDoesNotExistFault("This machine does not exist.",new MachineDoesNotExistFaultType());
        }
        else{
            return res;
        }

    }

    @Override
    public MachineInfoList getMachineInfosByType(GetMachineInfosByTypeParamType getMachineInfosByTypeParam) {
        MachineInfoList res = new MachineInfoList();
        MachineType machineType = getMachineInfosByTypeParam.getMachineType();

        List<MachineInfoType> machineInfoTypes = new ArrayList<>();
        res.setMachineInfo(machineInfoTypes);

        for(int i=5;i<resourceLines.size();i++){

            String[] properties = resourceLines.get(i).split(",",-1);
            if(properties[2].equals("线体")||properties[2].equals("设备")){

                if((properties[1].contains("line")&&machineType==MachineType.LINE)||((!properties[1].contains("line"))&&machineType==MachineType.EQUIPMENT)){

                    MachineInfoType machineInfoType = new MachineInfoType();
                    setMachineProperties(machineInfoType,properties);
                    machineInfoTypes.add(machineInfoType);
                }

            }

        }

        return res;
    }

    @Override
    public ItemInfoList getAllItemInfos(String getAllItemInfosParam) {
        ItemInfoList res = new ItemInfoList();
        List<ItemInfoType> itemInfoTypes = new ArrayList<>();
        res.setItemInfo(itemInfoTypes);

        for(int i=1;i<itemLines.size();i++){
            String[] properties = null;
            String line = itemLines.get(i);
            properties = generateItemProperties(line);
            ItemInfoType itemInfoType = new ItemInfoType();
            setItemProperties(itemInfoType,properties);
            itemInfoTypes.add(itemInfoType);
        }

        return res;
    }

    @Override
    public ItemInfoType getItemInfoById(GetItemInfoByIdParamType getItemInfoByIdParam) throws ItemDoesNotExistFault {

        ItemInfoType res = new ItemInfoType();
        String id = getItemInfoByIdParam.getItemId();
        boolean existed = false;
        for(int i=1;i<itemLines.size();i++){
            String[] properties = null;
            String line = itemLines.get(i);
           properties = generateItemProperties(line);
           if(id.equals(properties[0])){
               setItemProperties(res,properties);
               existed = true;
           }
        }

        if(!existed){
            throw new ItemDoesNotExistFault("This item does not exist.",new ItemDoesNotExistFaultType());
        }
        else{
            return res;
        }

    }

    private void setGroupProperties(GroupInformationType g, String[] properties){
        g.setGroupId(properties[1].substring(0,properties[1].indexOf("组")));
        g.setGroupName(properties[1]);
        g.setAbility(Integer.parseInt(properties[1].substring(properties[1].indexOf("（")+1,properties[1].indexOf("）"))));
    }

    private void setMachineProperties(MachineInfoType m, String[] properties){
        m.setName(properties[1]);
        if(properties[1].contains("line")){
            // 【fix】设置为资源量（同一型号有几个）
            m.setNumber(Integer.parseInt(properties[5]));
            m.setType(MachineType.LINE);
        }
        else{
            m.setNumber(Integer.parseInt(properties[5]));
            m.setType(MachineType.EQUIPMENT);
        }

    }
    public void setItemProperties(ItemInfoType i,String[] properties){
        i.setItemId(properties[0]);
        i.setDescription(properties[1]);
        System.out.println(properties[2]);
        i.setProperty(ItemPropertyType.valueOf(properties[2]));
        i.setMeasurement(properties[3]);
        i.setColor(properties[4]);
        i.setLength(properties[5]);
        i.setHard(properties[6]);
        i.setOtherSpecification(properties[7]);
        i.setPrepareMode(PrepareModeType.valueOf(properties[8]));
        if(properties[9].equals("")){
            i.setMinimumPacking(1);
        }
        else{
            i.setMinimumPacking(Integer.parseInt(properties[9]));
        }


    }

    private String[] arrayAdd(String[] a1,String[] a2){
        int size = a1.length+a2.length;
        String[] res = new String[size];
        System.arraycopy(a1, 0, res, 0, a1.length);
        if (size - a1.length >= 0) System.arraycopy(a2, 0, res, a1.length, size - a1.length);

        return res;
    }

    private String[] arrayAddElement(String[] a1,String a2){
        int size = a1.length+1;
        String[] res = new String[size];
        System.arraycopy(a1, 0, res, 0, a1.length);
        res[size-1] = a2;

        return res;
    }

    private String[] generateItemProperties(String line){
        String[] res =null;
        if(line.contains(",\"")){

            String[] temp1 = line.substring(0,line.indexOf(",\"")).split(",",-1);
            String tempStr = line.substring(line.indexOf(",\"")+2,line.indexOf("\"",line.indexOf(",\"")+2));
            String[] temp2 = line.substring(line.indexOf(",\"")+4+tempStr.length()).split(",",-1);
           res = arrayAddElement(temp1,tempStr);
            res = arrayAdd(res,temp2);
        }
        else{
            res = line.split(",",-1);
        }
        return res;
    }
}
