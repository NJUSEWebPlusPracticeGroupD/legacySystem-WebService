package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.BOMEntity.*;
import com.example.oldCompanySystem.bl.BOMPort;
import com.example.oldCompanySystem.dao.CsvReader;
import org.apache.cxf.staxutils.StaxUtils;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebService(name = "BOMPort", targetNamespace = "http://www.oldSystem.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Service("BOM")
public class BOMPortImpl implements BOMPort {

    public static final String MAIN_RESOURCE = "主资源";
    public static final String VICE_RESOURCE = "副资源";
    public static final String BOM_FILE_PATH = "csv/BOM.csv";
    public static final Pattern CAPACITY_PATTERN = Pattern.compile("(\\d+)(.*)");
    private BOMList bomList;

    @PostConstruct
    public void init() {
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
        bomList = new BOMList();
        List<String> fileLines = new CsvReader(BOM_FILE_PATH).readCsv();
        List<List<String>> rowAndColumn = new ArrayList<>();
        for (int i = 1; i < fileLines.size(); i++) {
            rowAndColumn.add(Arrays.asList(fileLines.get(i).split(",")));
        }
        for (List<String> column : rowAndColumn) {
            boolean handlingNewBOM = !"".equals(column.get(0));
            boolean handlingNewProcess = !"".equals(column.get(1));
            boolean handlingNewMaterial = !"".equals(column.get(2));
            boolean handlingNewGroup = MAIN_RESOURCE.equals(column.get(8));
            boolean handlingNewMachine = VICE_RESOURCE.equals(column.get(8));
            if (handlingNewBOM) {
                BOMType bomType = new BOMType();
                bomType.setItemId(column.get(0));
                bomType.setProcessList(new BOMType.ProcessList());
                bomList.getBOMInfo().add(bomType);
            }
            if (handlingNewProcess) {
                ProcessType processType = new ProcessType();
                processType.setProcessName(column.get(1));
                // 物料
                processType.setRequiredMaterialInfoList(new ProcessType.RequiredMaterialInfoList());
                // 主资源人员
                processType.setAlternativeGroupInfoList(new ProcessType.AlternativeGroupInfoList());
                // 副资源机器
                processType.setAlternativeMachineInfoList(new ProcessType.AlternativeMachineInfoList());
                // 产品规定生产人员
                processType.setNumOfPersonnel(Integer.parseInt(column.get(13)));
                bomList.getBOMInfo().get(bomList.getBOMInfo().size() - 1).getProcessList().getProcess().add(processType);
            }
            if (handlingNewMaterial) {
                RequiredMaterialInfoType requiredMaterialInfoType = new RequiredMaterialInfoType();
                requiredMaterialInfoType.setMaterialId(column.get(2));
                requiredMaterialInfoType.setMaterialProperty(ItemPropertyType.fromValue(column.get(3)));
                requiredMaterialInfoType.setNumber(Double.parseDouble(column.get(4)));
                requiredMaterialInfoType.setUnit(column.get(5));
                List<ProcessType> processTypeList = bomList.getBOMInfo().get(bomList.getBOMInfo().size() - 1).getProcessList().getProcess();
                processTypeList.get(processTypeList.size() - 1).getRequiredMaterialInfoList().getRequiredMaterialInfo().add(requiredMaterialInfoType);
            }
            if (handlingNewGroup || handlingNewMachine) {
                ResourceInfoType resourceInfoType = new ResourceInfoType();
                resourceInfoType.setResourceName(column.get(6));
                resourceInfoType.setResourceMode(column.get(7));
                resourceInfoType.setResourceType(ResourceType.fromValue(column.get(8)));
                resourceInfoType.setLeastNumOfResource("".equals(column.get(9)) ? 0 : Integer.parseInt(column.get(9)));
                resourceInfoType.setStandardCapacity(parseStandardCapacity(column.get(10)));
                resourceInfoType.setPriority(Integer.parseInt(column.get(11)));
                resourceInfoType.setTimeOfChangeLine(Double.parseDouble(column.get(12).substring(0, column.get(12).length() - 1)));
                List<ProcessType> processTypeList = bomList.getBOMInfo().get(bomList.getBOMInfo().size() - 1).getProcessList().getProcess();
                if (handlingNewGroup) {
                    processTypeList.get(processTypeList.size() - 1).getAlternativeGroupInfoList().getAlternativeGroupInfo().add(resourceInfoType);
                } else {
                    processTypeList.get(processTypeList.size() - 1).getAlternativeMachineInfoList().getAlternativeMachineInfo().add(resourceInfoType);
                }
            }
        }
    }

    @Override
    public BOMList getAllBOMs(String getAllBOMsParam) {
        return bomList;
    }

    @Override
    public BOMType getBOMByItemId(GetBOMByItemIdParamType getBOMByItemIdParam) throws ItemDoesNotExistFault {
        for (BOMType bomType:bomList.getBOMInfo()){
            if (bomType.getItemId().equals(getBOMByItemIdParam.getItemId())){
                return bomType;
            }
        }
        return null;
    }


    public int parseStandardCapacity(String rawStr) {
        Matcher matcher = CAPACITY_PATTERN.matcher(rawStr);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 0;
    }
}
