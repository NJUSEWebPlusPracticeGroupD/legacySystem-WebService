
package com.example.oldCompanySystem.Entity.PersonnelEntity;

import com.example.oldCompanySystem.bl.PersonnelPort;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PersonnelService", targetNamespace = "http://www.oldSystem.com/wsdl", wsdlLocation = "file:/C:/Users/82582/Desktop/\u5b9e\u8df5\u8bfe/oldSystem/xml/wsdl/PersonnelSystem.wsdl")
public class PersonnelService
    extends Service
{

    private final static URL PERSONNELSERVICE_WSDL_LOCATION;
    private final static WebServiceException PERSONNELSERVICE_EXCEPTION;
    private final static QName PERSONNELSERVICE_QNAME = new QName("http://www.oldSystem.com/wsdl", "PersonnelService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/82582/Desktop/\u5b9e\u8df5\u8bfe/oldSystem/xml/wsdl/PersonnelSystem.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PERSONNELSERVICE_WSDL_LOCATION = url;
        PERSONNELSERVICE_EXCEPTION = e;
    }

    public PersonnelService() {
        super(__getWsdlLocation(), PERSONNELSERVICE_QNAME);
    }

    public PersonnelService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PERSONNELSERVICE_QNAME, features);
    }

    public PersonnelService(URL wsdlLocation) {
        super(wsdlLocation, PERSONNELSERVICE_QNAME);
    }

    public PersonnelService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PERSONNELSERVICE_QNAME, features);
    }

    public PersonnelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonnelService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PersonnelPort
     */
    @WebEndpoint(name = "PersonnelPort")
    public PersonnelPort getPersonnelPort() {
        return super.getPort(new QName("http://www.oldSystem.com/wsdl", "PersonnelPort"), PersonnelPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonnelPort
     */
    @WebEndpoint(name = "PersonnelPort")
    public PersonnelPort getPersonnelPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.oldSystem.com/wsdl", "PersonnelPort"), PersonnelPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PERSONNELSERVICE_EXCEPTION!= null) {
            throw PERSONNELSERVICE_EXCEPTION;
        }
        return PERSONNELSERVICE_WSDL_LOCATION;
    }

}
