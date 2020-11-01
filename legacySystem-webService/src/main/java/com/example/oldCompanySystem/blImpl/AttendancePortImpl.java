package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.AttendanceEntity.*;
import com.example.oldCompanySystem.bl.AttendancePort;
import com.example.oldCompanySystem.dao.CsvReader;
import org.apache.cxf.staxutils.StaxUtils;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.*;

@WebService(name = "AttendancePort", targetNamespace = "http://www.oldSystem.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class AttendancePortImpl implements AttendancePort {
    @PostConstruct
    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
    }

    public static ArrayList<String> fileLines = new CsvReader("csv\\日历.csv").readCsv();
    public static ArrayList<String> resourceLines = new CsvReader("csv\\资源.csv").readCsv();
    public static ArrayList<String> scheduleLines = new CsvReader("csv\\班次.csv").readCsv();

    @Override
    public GroupScheduleInformationList getAllGroupSchedules(String getAllGroupSchedulesParam) {
        GroupScheduleInformationList res = new GroupScheduleInformationList();
        List<GroupScheduleInformationType>  groupScheduleInformationTypes = new ArrayList<>();
        res.setGroupScheduleInformation(groupScheduleInformationTypes);
        int cnt = 0;
        for(String line:fileLines){
            if(cnt==0){cnt++;continue;}
            String[] properties = line.split(",",-1);
            for(int i=5;i<resourceLines.size();i++){
                String resourceLine = resourceLines.get(i);
                String[] tempProperties = resourceLine.split(",",-1);
                if(properties[0].equals(tempProperties[1])&&tempProperties[2].equals("班组")){
                    GroupScheduleInformationType gs = new GroupScheduleInformationType();
                    setProperties(gs,properties);
                    groupScheduleInformationTypes.add(gs);
                    break;
                }
            }

        }

        return res;
    }

    @Override
    public GroupScheduleInformationType getGroupScheduleById(GetGroupScheduleInformationParamType getGroupScheduleByIdParam) throws GroupDoesNotExistFault {

        GroupScheduleInformationType res = new GroupScheduleInformationType();
        int cnt = 0;
        boolean existed = false;
        String id = getGroupScheduleByIdParam.getGroupId();

        for(String line:fileLines){
            if(cnt==0){cnt++;continue;}
            String[] properties = line.split(",",-1);
            for(int i=5;i<resourceLines.size();i++){
                String resourceLine = resourceLines.get(i);
                String[] tempProperties = resourceLine.split(",",-1);
                if(properties[0].equals(tempProperties[1])&&tempProperties[2].equals("班组")){
                    if(properties[0].substring(0,properties[0].indexOf("组")).equals(id)){

                        setProperties(res,properties);
                        existed = true;
                        break;
                    }

                }
            }
            if(existed){break;}
        }
        if(!existed){
            throw new GroupDoesNotExistFault("This group does not exist.",new GroupDoesNotExistFaultType());
        }
        else{
            return res;
        }


    }

    @Override
    public ShiftList getAllShifts(String getAllShiftsParam) {
        ShiftList res = new ShiftList();
        List<ShiftType> shiftTypes = new ArrayList<>();
        res.setShift(shiftTypes);
        for(int i=1;i<scheduleLines.size();i++){
            String[] scheduleLineSplit = scheduleLines.get(i).split(",",-1);
            if(!scheduleLineSplit[1].equals("")){
                ShiftType st = new ShiftType();
                String key = scheduleLineSplit[1];
                String[] temp = scheduleLineSplit[2].split("[-]");
                st.setShiftKind(ShiftKindType.valueOf(key));
                ShiftTimeType stt = new ShiftTimeType();
                stt.setStartTime(temp[0]);
                stt.setEndTime(temp[1]);
                st.setShiftTime(stt);
                shiftTypes.add(st);
            }
        }
        return res;
    }

    private void setProperties(GroupScheduleInformationType gs,String[] properties){
        GroupInformationType groupInformationType = new GroupInformationType();
        groupInformationType.setGroupId(properties[0].substring(0,properties[0].indexOf("组")));
        groupInformationType.setAbility(Integer.parseInt(properties[0].substring(properties[0].indexOf("（")+1,properties[0].indexOf("）"))));
        groupInformationType.setGroupName(properties[0]);
        gs.setGroupInformation(groupInformationType);
        ShiftType s = new ShiftType();
        ShiftTimeType st = new ShiftTimeType();
        Map<String, String[]> times = new HashMap<>();

        for(int i=1;i<scheduleLines.size();i++){
            String[] scheduleLineSplit = scheduleLines.get(i).split(",",-1);
            if(!scheduleLineSplit[1].equals("")){
                String key = scheduleLineSplit[1];
                String[] temp = scheduleLineSplit[2].split("[-]");

                String[] dates = {temp[0],temp[1]};
                times.put(key,dates);
            }
        }


            s.setShiftKind(ShiftKindType.valueOf(properties[2]));
            st.setStartTime(times.get(properties[2])[0]);
            st.setEndTime(times.get(properties[2])[1]);
            s.setShiftTime(st);

            gs.setShift(s);
            DaysOfWeekType daysOfWeekType = new DaysOfWeekType();
            String startDay = properties[1].split("[-]")[0];
            String endDay = properties[1].split("[-]")[1];

            daysOfWeekType.setStartDay(WeekDayType.valueOf(startDay));
            daysOfWeekType.setEndDay(WeekDayType.valueOf(endDay));
            gs.setDaysOfWeek(daysOfWeekType);

    }

    private XMLGregorianCalendar dateGenerate(String dateString,String format){

        Date date = null;
        try{
            date= new SimpleDateFormat(format).parse(dateString);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
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
        return gc;
    }

}
