
package com.example.oldCompanySystem.Entity.PersonnelEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="personnelInfo" type="{http://www.oldCompany.com/personnel}personnelInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personnelInfo"
})
@XmlRootElement(name = "personnelInfoList")
public class PersonnelInfoList {

    public void setPersonnelInfo(List<PersonnelInfoType> personnelInfo) {
        this.personnelInfo = personnelInfo;
    }

    protected List<PersonnelInfoType> personnelInfo;

    /**
     * Gets the value of the personnelInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonnelInfoType }
     * 
     * 
     */
    public List<PersonnelInfoType> getPersonnelInfo() {
        if (personnelInfo == null) {
            personnelInfo = new ArrayList<PersonnelInfoType>();
        }
        return this.personnelInfo;
    }

}
