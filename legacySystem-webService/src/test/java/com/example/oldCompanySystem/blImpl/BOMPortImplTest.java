package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.BOMEntity.*;
import com.example.oldCompanySystem.bl.BOMPort;
import com.example.oldCompanySystem.dao.CsvReader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BOMPortImplTest {

    @Resource(name = "BOM")
    public BOMPort bomPort;

    @Test
    public void bomTest1() {
        BOMList bomList = bomPort.getAllBOMs("getAllBOMsParam");
        assertEquals("line14",bomList.getBOMInfo().get(1).getProcessList().getProcess().get(0).getAlternativeMachineInfoList().getAlternativeMachineInfo().get(0).getResourceName());
    }

    @Test
    public void bomTest2(){
        GetBOMByItemIdParamType idParamType = new GetBOMByItemIdParamType();
        idParamType.setItemId("3211498");
        try {
            BOMType bomByItemId = bomPort.getBOMByItemId(idParamType);
            assertEquals("line14",bomByItemId.getProcessList().getProcess().get(0).getAlternativeMachineInfoList().getAlternativeMachineInfo().get(0).getResourceName());
        } catch (ItemDoesNotExistFault itemDoesNotExistFault) {
            itemDoesNotExistFault.printStackTrace();
        }
    }
}