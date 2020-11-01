
package com.example.oldCompanySystem.bl;

import com.example.oldCompanySystem.Entity.BOMEntity.*;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BOMPort", targetNamespace = "http://www.oldSystem.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BOMPort {


    /**
     * 
     * @param getAllBOMsParam
     * @return
     *     returns BOMEntity.BOMList
     */
    @WebMethod(action = "bom/getAllBOMs")
    @WebResult(name = "BOMList", targetNamespace = "http://www.oldCompany.com/bom", partName = "BOMInfoList")
    @Action(input = "bom/getAllBOMsRequest", output = "bom/getAllBOMsResponse")
    public BOMList getAllBOMs(
            @WebParam(name = "getAllBOMsParam", targetNamespace = "http://www.oldCompany.com/bom", partName = "getAllBOMsParam")
                    String getAllBOMsParam);

    /**
     *
     * @param getBOMByItemIdParam
     * @return
     *     returns BOMEntity.BOMType
     * @throws ItemDoesNotExistFault
     */
    @WebMethod(action = "bom/getBOMByItemId")
    @WebResult(name = "BOMInfo", targetNamespace = "http://www.oldCompany.com/bom", partName = "BOMInfo")
    @Action(input = "bom/getBOMByItemIdRequest", output = "bom/getBOMByItemIdResponse", fault = {
        @FaultAction(className = ItemDoesNotExistFault.class, value = "bom/ItemDoesNotExistFault")
    })
    public BOMType getBOMByItemId(
            @WebParam(name = "getBOMByItemIdParam", targetNamespace = "http://www.oldCompany.com/bom", partName = "getBOMByItemIdParam")
                    GetBOMByItemIdParamType getBOMByItemIdParam)
        throws ItemDoesNotExistFault
    ;

}
