
package com.example.oldCompanySystem.Entity.AttendanceEntity;

import javax.xml.bind.annotation.*;
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
 *         &lt;element name="GroupScheduleInformation" type="{http://www.oldCompany.com/attendance}GroupScheduleInformationType"/>
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
    "groupScheduleInformation"
})
@XmlRootElement(name = "GroupScheduleInformationList", namespace = "http://www.oldCompany.com/attendance")
public class GroupScheduleInformationList {

    public void setGroupScheduleInformation(List<GroupScheduleInformationType> groupScheduleInformation) {
        this.groupScheduleInformation = groupScheduleInformation;
    }

    @XmlElement(name = "GroupScheduleInformation", namespace = "http://www.oldCompany.com/attendance")
    protected List<GroupScheduleInformationType> groupScheduleInformation;

    /**
     * Gets the value of the groupScheduleInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupScheduleInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupScheduleInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupScheduleInformationType }
     * 
     * 
     */
    public List<GroupScheduleInformationType> getGroupScheduleInformation() {
        if (groupScheduleInformation == null) {
            groupScheduleInformation = new ArrayList<GroupScheduleInformationType>();
        }
        return this.groupScheduleInformation;
    }

}
