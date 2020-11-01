package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.ERPEntity.*;
import com.example.oldCompanySystem.blImpl.ErpPortImpl;
import com.example.oldCompanySystem.dao.CsvReader;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ErpImplTest {
    @Test
    void ErpImplTest1(){
        ErpPortImpl erpPort = new ErpPortImpl();
        ErpPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        ErpPortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        GroupInfoList res = erpPort.getAllGroupInfos("getAllGroupInfos");

        Assert.assertEquals(4,res.getGroupInfo().size());
        Assert.assertEquals("5组-童小玲 （5）",res.getGroupInfo().get(0).getGroupName());
    }

    @Test
    void ErpImplTest2() throws GroupDoesNotExistFault {
        ErpPortImpl erpPort = new ErpPortImpl();
        ErpPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        ErpPortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        GetGroupInfoByIdParamType param = new GetGroupInfoByIdParamType();
        param.setGroupId("5");
        GroupInformationType res = erpPort.getGroupInfoById(param);

        Assert.assertEquals("5组-童小玲 （5）",res.getGroupName());
    }

    @Test
    void ErpImplTest3(){
        ErpPortImpl erpPort = new ErpPortImpl();
        ErpPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        ErpPortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        GetGroupInfoByIdParamType param = new GetGroupInfoByIdParamType();
        param.setGroupId("20");
        try{
            GroupInformationType res = erpPort.getGroupInfoById(param);
        }
        catch (GroupDoesNotExistFault e){
            Assert.assertEquals("This group does not exist.",e.getMessage());
        }



    }

    @Test
    void ErpImplTest4() throws GroupDoesNotExistFault {
        ErpPortImpl erpPort = new ErpPortImpl();
        ErpPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        ErpPortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        GetGroupInfoByMemberNameParamType param = new GetGroupInfoByMemberNameParamType();
        param.setMemberName("童小玲 ");

        GroupInformationType res = erpPort.getGroupInfoByMemberName(param);

        Assert.assertEquals(res.getGroupId(),"5");

    }

    @Test
    void ErpImplTest5(){
        ErpPortImpl erpPort = new ErpPortImpl();
        ErpPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        ErpPortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        GetGroupInfoByMemberNameParamType param = new GetGroupInfoByMemberNameParamType();
        param.setMemberName("ff");

        try{
            GroupInformationType res = erpPort.getGroupInfoByMemberName(param);
        }
        catch (GroupDoesNotExistFault e){
            Assert.assertEquals("This group does not exist.",e.getMessage());
        }



    }
    @Test
    void ErpImplTest6(){
        ErpPortImpl erpPort = new ErpPortImpl();
        ErpPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        ErpPortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        MachineInfoList res = erpPort.getAllMachineInfos("getAllMachineInfos");

        Assert.assertEquals(5,res.getMachineInfo().size());
        Assert.assertEquals("line02",res.getMachineInfo().get(1).getName());
    }

    @Test
    void ErpImplTest7() throws MachineDoesNotExistFault {
        ErpPortImpl erpPort = new ErpPortImpl();
        ErpPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        ErpPortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        GetMachineInfoByNameParamType param = new GetMachineInfoByNameParamType();
        param.setMachineName("移印机");

        MachineInfoType res = erpPort.getMachineInfoByName(param);

        Assert.assertEquals("equipment",res.getType().value());
        Assert.assertEquals(1,res.getNumber());
    }

    @Test
    void ErpImplTest8(){
        ErpPortImpl erpPort = new ErpPortImpl();
        ErpPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        ErpPortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        GetMachineInfoByNameParamType param = new GetMachineInfoByNameParamType();
        param.setMachineName("不存在之机");

        try{
        MachineInfoType res = erpPort.getMachineInfoByName(param);}
        catch (MachineDoesNotExistFault e){
            Assert.assertEquals("This machine does not exist.",e.getMessage());
        }


    }

    @Test
    void ErpImplTest9(){
        ErpPortImpl erpPort = new ErpPortImpl();
        ErpPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        ErpPortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        GetMachineInfosByTypeParamType param = new GetMachineInfosByTypeParamType();
        param.setMachineType(MachineType.LINE);

        MachineInfoList res = erpPort.getMachineInfosByType(param);

        Assert.assertEquals(3,res.getMachineInfo().size());
        Assert.assertEquals("line02",res.getMachineInfo().get(1).getName());
    }

    @Test
    void ErpImplTest10(){
        ErpPortImpl erpPort = new ErpPortImpl();
        ErpPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        ErpPortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        ItemInfoList res = erpPort.getAllItemInfos("getAllItemInfos");

        Assert.assertEquals(5,res.getItemInfo().size());
        Assert.assertEquals("UK 6 N CURRENT BAR SN                                       ",res.getItemInfo().get(2).getDescription());
    }

    @Test
    void ErpImplTest11() throws ItemDoesNotExistFault {
        ErpPortImpl erpPort = new ErpPortImpl();
        ErpPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        ErpPortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        GetItemInfoByIdParamType param = new GetItemInfoByIdParamType();
        param.setItemId("764486");

        ItemInfoType res =  erpPort.getItemInfoById(param);

        Assert.assertEquals("外购",res.getPrepareMode().value());
        Assert.assertEquals("PAPER BOX 216 X 92 X 49                                     ",res.getDescription());

    }


    @Test
    void ErpImplTest12(){
        ErpPortImpl erpPort = new ErpPortImpl();
        ErpPortImpl.itemLines = new CsvReader("src/test/java/testData/物品信息.csv").readCsv();
        ErpPortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        GetItemInfoByIdParamType param = new GetItemInfoByIdParamType();
        param.setItemId("000");

        try{
        ItemInfoType res =  erpPort.getItemInfoById(param);}
        catch (ItemDoesNotExistFault e){
            Assert.assertEquals("This item does not exist.",e.getMessage());
        }
    }





}
