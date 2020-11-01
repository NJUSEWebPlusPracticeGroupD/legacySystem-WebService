package com.example.oldCompanySystem.blImpl;
import com.example.oldCompanySystem.Entity.AttendanceEntity.*;
import com.example.oldCompanySystem.blImpl.AttendancePortImpl;
import com.example.oldCompanySystem.dao.CsvReader;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AttendanceImplTest {
    @Test
    void AttendanceImplTest1(){
        AttendancePortImpl attendancePort = new AttendancePortImpl();
        AttendancePortImpl.fileLines = new CsvReader("src/test/java/testData/日历.csv").readCsv();
        AttendancePortImpl.scheduleLines = new CsvReader("src/test/java/testData/班次.csv").readCsv();
        AttendancePortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();


        GroupScheduleInformationList res = attendancePort.getAllGroupSchedules("getAllGroupSchedules");

        Assert.assertEquals(4,res.getGroupScheduleInformation().size());
        Assert.assertEquals("6组-李倩（4）",res.getGroupScheduleInformation().get(1).getGroupInformation().getGroupName());
        Assert.assertEquals("星期一",res.getGroupScheduleInformation().get(1).getDaysOfWeek().getStartDay().value());
        Assert.assertEquals("星期五",res.getGroupScheduleInformation().get(1).getDaysOfWeek().getEndDay().value());
        Assert.assertEquals("晚班",res.getGroupScheduleInformation().get(1).getShift().getShiftKind().value());

    }

    @Test
    void AttendanceImplTest2() throws GroupDoesNotExistFault {
        AttendancePortImpl attendancePort = new AttendancePortImpl();
        AttendancePortImpl.fileLines = new CsvReader("src/test/java/testData/日历.csv").readCsv();
        AttendancePortImpl.scheduleLines = new CsvReader("src/test/java/testData/班次.csv").readCsv();
        AttendancePortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        GetGroupScheduleInformationParamType param = new GetGroupScheduleInformationParamType();
        param.setGroupId("5");
        GroupScheduleInformationType res = attendancePort.getGroupScheduleById(param);

        Assert.assertEquals("5组-童小玲 （5）",res.getGroupInformation().getGroupName());
        Assert.assertEquals("早班",res.getShift().getShiftKind().value());
    }

    @Test
    void AttendanceImplTest3(){
        AttendancePortImpl attendancePort = new AttendancePortImpl();
        AttendancePortImpl.fileLines = new CsvReader("src/test/java/testData/日历.csv").readCsv();
        AttendancePortImpl.scheduleLines = new CsvReader("src/test/java/testData/班次.csv").readCsv();
        AttendancePortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();

        GetGroupScheduleInformationParamType param = new GetGroupScheduleInformationParamType();
        param.setGroupId("20");

        try{GroupScheduleInformationType res = attendancePort.getGroupScheduleById(param);}
        catch (GroupDoesNotExistFault e){
            Assert.assertEquals("This group does not exist.",e.getMessage());
        }

    }

    @Test
    void AttendanceImplTest4(){
        AttendancePortImpl attendancePort = new AttendancePortImpl();
        AttendancePortImpl.fileLines = new CsvReader("src/test/java/testData/日历.csv").readCsv();
        AttendancePortImpl.scheduleLines = new CsvReader("src/test/java/testData/班次.csv").readCsv();
        AttendancePortImpl.resourceLines = new CsvReader("src/test/java/testData/资源.csv").readCsv();


        ShiftList res =  attendancePort.getAllShifts("getAllShifts");
        Assert.assertEquals(3,res.getShift().size());
        Assert.assertEquals("早班",res.getShift().get(1).getShiftKind().value());
        Assert.assertEquals("19:00",res.getShift().get(2).getShiftTime().getStartTime());
        Assert.assertEquals("07:00",res.getShift().get(2).getShiftTime().getEndTime());
    }


}
