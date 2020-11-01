//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.09.25 时间 10:16:06 AM CST 
//


package com.example.oldCompanySystem.Entity.BOMEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getMachineInfosByTypeParamType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getMachineInfosByTypeParamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="machineType" type="{http://www.oldCompany.com/erp}machineType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMachineInfosByTypeParamType", propOrder = {
    "machineType"
})
public class GetMachineInfosByTypeParamType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MachineType machineType;

    /**
     * 获取machineType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MachineType }
     *     
     */
    public MachineType getMachineType() {
        return machineType;
    }

    /**
     * 设置machineType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MachineType }
     *     
     */
    public void setMachineType(MachineType value) {
        this.machineType = value;
    }

}
