
package com.example.oldCompanySystem.Entity.PersonnelEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getPersonnelInfoByIdParamType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getPersonnelInfoByIdParamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personnelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonnelInfoByIdParamType", propOrder = {
    "personnelId"
})
public class GetPersonnelInfoByIdParamType {

    protected int personnelId;

    /**
     * 获取personnelId属性的值。
     * 
     */
    public int getPersonnelId() {
        return personnelId;
    }

    /**
     * 设置personnelId属性的值。
     * 
     */
    public void setPersonnelId(int value) {
        this.personnelId = value;
    }

}
