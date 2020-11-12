package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.PersonnelEntity.*;
import com.example.oldCompanySystem.bl.PersonnelPort;
import com.example.oldCompanySystem.dao.CsvReader;
import org.apache.cxf.staxutils.StaxUtils;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebService(name = "PersonnelPort", targetNamespace = "http://www.oldSystem.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class PersonnelPortImpl implements PersonnelPort {
    @PostConstruct
    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
    }

    public static ArrayList<String> fileLines = new CsvReader("csv/人员.csv").readCsv();

    @Override
    public PersonnelInfoList getAllPersonnelInfos(String getAllPersonnelInfosParam) {
        PersonnelInfoList res = new PersonnelInfoList();
        List<PersonnelInfoType> personnelInfoTypes = new ArrayList<>();
        res.setPersonnelInfo(personnelInfoTypes);
        int cnt = 0;
        for(String line:fileLines){
            if(cnt==0){cnt++;continue;}
            String[] properties = line.split(",",-1);
            PersonnelInfoType p = new PersonnelInfoType();
            setProperties(p,properties);
            personnelInfoTypes.add(p);
        }
        return res;
    }

    @Override
    public PersonnelInfoType getPersonnelInfoById(GetPersonnelInfoByIdParamType getPersonnelInfoByIdParam) throws PersonnelDoesNotExistFault {
        PersonnelInfoType res = new PersonnelInfoType();
        int cnt = 0;
        boolean existed = false;
        for(String line:fileLines){
            if(cnt==0){cnt++;continue;}
            String[] properties = line.split(",",-1);
            if(properties[0].equals(getPersonnelInfoByIdParam.getPersonnelId()+"")){
                setProperties(res,properties);
                existed = true;
            }
        }
        if(!existed){
            throw new PersonnelDoesNotExistFault("This personnel does not exist.",new PersonnelDoesNotExistFaultType());
        }
        return res;
    }

    @Override
    public PersonnelInfoType getPersonnelInfoByName(GetPersonnelInfoByNameParamType getPersonnelInfoByNameParam) throws PersonnelDoesNotExistFault {
        PersonnelInfoType res = new PersonnelInfoType();
        int cnt = 0;
        boolean existed = false;
        for(String line:fileLines){
            if(cnt==0){cnt++;continue;}
            String[] properties = line.split(",",-1);
            if(properties[1].equals(getPersonnelInfoByNameParam.getPersonnelName())){
                setProperties(res,properties);
                existed = true;
            }
        }
        if(!existed){
            throw new PersonnelDoesNotExistFault("This personnel does not exist.",new PersonnelDoesNotExistFaultType());
        }
        return res;
    }

    @Override
    public RoleType getPersonnelRoleById(GetPersonnelRoleByIdParamType getPersonnelRoleByIdParam) throws PersonnelDoesNotExistFault {

        int cnt = 0;
        boolean existed = false;
        RoleType res = null;
        for(String line:fileLines){
            if(cnt==0){cnt++;continue;}
            String[] properties = line.split(",",-1);
            if(properties[0].equals(getPersonnelRoleByIdParam.getPersonnelId()+"")){
                switch (properties[2]){
                    case "员工":
                        res = RoleType.员工;
                        break;
                    case "管理员":
                        res = RoleType.管理员;

                }
                existed = true;
                break;

            }
        }
        if(!existed){
            throw new PersonnelDoesNotExistFault("This personnel does not exist.",new PersonnelDoesNotExistFaultType());
        }

        return res;
    }

    @Override
    public RoleType getPersonnelRoleByName(GetPersonnelRoleByNameParamType getPersonnelRoleByNameParam) throws PersonnelDoesNotExistFault {
        int cnt = 0;
        boolean existed = false;
        RoleType res = null;
        for(String line:fileLines){
            if(cnt==0){cnt++;continue;}
            String[] properties = line.split(",",-1);
            if(properties[1].equals(getPersonnelRoleByNameParam.getPersonnelName())){
                switch (properties[2]){
                    case "员工":
                        res = RoleType.员工;
                        break;
                    case "管理员":
                        res = RoleType.管理员;

                }
                existed = true;
                break;

            }
        }
        if(!existed){
            throw new PersonnelDoesNotExistFault("This personnel does not exist.",new PersonnelDoesNotExistFaultType());
        }

        return res;

    }

    private void setProperties(PersonnelInfoType p,String[] properties){
        p.setId(Integer.parseInt(properties[0]));
        p.setName(properties[1]);
        switch (properties[2]){
            case "员工":
                p.setRole(RoleType.员工);
                break;
            case "管理员":
                p.setRole(RoleType.管理员);

        }


    }
}
