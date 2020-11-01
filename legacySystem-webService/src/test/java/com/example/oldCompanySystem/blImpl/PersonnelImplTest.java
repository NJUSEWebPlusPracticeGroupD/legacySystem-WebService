package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.PersonnelEntity.*;

import com.example.oldCompanySystem.blImpl.PersonnelPortImpl;
import com.example.oldCompanySystem.dao.CsvReader;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PersonnelImplTest {
    @Test
    void PersonnelImplTest1(){
        PersonnelPortImpl personnelPort = new PersonnelPortImpl();
        PersonnelPortImpl.fileLines = new CsvReader("src/test/java/testData/人员.csv").readCsv();
        PersonnelInfoList res = personnelPort.getAllPersonnelInfos("getAllPersonnelInfos");
        Assert.assertEquals(4,res.getPersonnelInfo().size());
        Assert.assertEquals("张萍",res.getPersonnelInfo().get(3).getName());
    }

    @Test
    void PersonnelImplTest2() throws PersonnelDoesNotExistFault {
        PersonnelPortImpl personnelPort = new PersonnelPortImpl();
        PersonnelPortImpl.fileLines = new CsvReader("src/test/java/testData/人员.csv").readCsv();
        GetPersonnelInfoByIdParamType param = new GetPersonnelInfoByIdParamType();
        param.setPersonnelId(2);

        PersonnelInfoType res = personnelPort.getPersonnelInfoById(param);
        Assert.assertEquals("李倩",res.getName());
    }

    @Test
    void PersonnelImplTest3(){
        PersonnelPortImpl personnelPort = new PersonnelPortImpl();
        PersonnelPortImpl.fileLines = new CsvReader("src/test/java/testData/人员.csv").readCsv();
        GetPersonnelInfoByIdParamType param = new GetPersonnelInfoByIdParamType();
        param.setPersonnelId(6);
        try{PersonnelInfoType res = personnelPort.getPersonnelInfoById(param);}
        catch (PersonnelDoesNotExistFault e){
            Assert.assertEquals("This personnel does not exist.",e.getMessage());
        }

    }

    @Test
    void PersonnelImplTest4() throws PersonnelDoesNotExistFault {
        PersonnelPortImpl personnelPort = new PersonnelPortImpl();
        PersonnelPortImpl.fileLines = new CsvReader("src/test/java/testData/人员.csv").readCsv();
        GetPersonnelInfoByNameParamType param = new GetPersonnelInfoByNameParamType();
        param.setPersonnelName("张萍");
        PersonnelInfoType res = personnelPort.getPersonnelInfoByName(param);
        Assert.assertEquals(4,res.getId());

    }

    @Test
    void PersonnelImplTest5()  {
        PersonnelPortImpl personnelPort = new PersonnelPortImpl();
        PersonnelPortImpl.fileLines = new CsvReader("src/test/java/testData/人员.csv").readCsv();
        GetPersonnelInfoByNameParamType param = new GetPersonnelInfoByNameParamType();
        param.setPersonnelName("张三");
        try{
            PersonnelInfoType res = personnelPort.getPersonnelInfoByName(param);
        }
        catch (PersonnelDoesNotExistFault e){
            Assert.assertEquals("This personnel does not exist.",e.getMessage());
        }


    }

    @Test
    void PersonnelImplTest6() throws PersonnelDoesNotExistFault {
        PersonnelPortImpl personnelPort = new PersonnelPortImpl();
        PersonnelPortImpl.fileLines = new CsvReader("src/test/java/testData/人员.csv").readCsv();
        GetPersonnelRoleByIdParamType param = new GetPersonnelRoleByIdParamType();
        param.setPersonnelId(3);

        RoleType res = personnelPort.getPersonnelRoleById(param);
        Assert.assertEquals(res.value(),"管理员");



    }

    @Test
    void PersonnelImplTest7()  {
        PersonnelPortImpl personnelPort = new PersonnelPortImpl();
        PersonnelPortImpl.fileLines = new CsvReader("src/test/java/testData/人员.csv").readCsv();
        GetPersonnelRoleByIdParamType param = new GetPersonnelRoleByIdParamType();
        param.setPersonnelId(6);
        try{
            RoleType res = personnelPort.getPersonnelRoleById(param);
        }
        catch (PersonnelDoesNotExistFault e){
            Assert.assertEquals("This personnel does not exist.",e.getMessage());
        }


    }

    @Test
    void PersonnelImplTest8() throws PersonnelDoesNotExistFault {
        PersonnelPortImpl personnelPort = new PersonnelPortImpl();
        PersonnelPortImpl.fileLines = new CsvReader("src/test/java/testData/人员.csv").readCsv();
        GetPersonnelRoleByNameParamType param = new GetPersonnelRoleByNameParamType();
        param.setPersonnelName("黄娣");

        RoleType res = personnelPort.getPersonnelRoleByName(param);
        Assert.assertEquals(res.value(),"管理员");



    }

    @Test
    void PersonnelImplTest9()  {
        PersonnelPortImpl personnelPort = new PersonnelPortImpl();
        PersonnelPortImpl.fileLines = new CsvReader("src/test/java/testData/人员.csv").readCsv();
        GetPersonnelRoleByNameParamType param = new GetPersonnelRoleByNameParamType();
        param.setPersonnelName("张三");
        try{
            RoleType res = personnelPort.getPersonnelRoleByName(param);
        }
        catch (PersonnelDoesNotExistFault e){
            Assert.assertEquals("This personnel does not exist.",e.getMessage());
        }


    }
}
