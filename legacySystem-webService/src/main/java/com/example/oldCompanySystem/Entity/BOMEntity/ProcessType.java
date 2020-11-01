//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.09.25 时间 10:16:06 AM CST 
//


package com.example.oldCompanySystem.Entity.BOMEntity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProcessType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProcessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requiredMaterialInfoList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="RequiredMaterialInfo" type="{http://www.oldCompany.com/bom}requiredMaterialInfoType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="alternativeGroupInfoList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="alternativeGroupInfo" type="{http://www.oldCompany.com/bom}resourceInfoType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="alternativeMachineInfoList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="alternativeMachineInfo" type="{http://www.oldCompany.com/bom}resourceInfoType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="numOfPersonnel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessType", namespace = "http://www.oldCompany.com/bom", propOrder = {
    "processName",
    "requiredMaterialInfoList",
    "alternativeGroupInfoList",
    "alternativeMachineInfoList",
    "numOfPersonnel"
})
public class ProcessType {

    @XmlElement(required = true)
    protected String processName;
    @XmlElement(required = true)
    protected ProcessType.RequiredMaterialInfoList requiredMaterialInfoList;
    @XmlElement(required = true)
    protected ProcessType.AlternativeGroupInfoList alternativeGroupInfoList;
    @XmlElement(required = true)
    protected ProcessType.AlternativeMachineInfoList alternativeMachineInfoList;
    protected int numOfPersonnel;

    /**
     * 获取processName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * 设置processName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessName(String value) {
        this.processName = value;
    }

    /**
     * 获取requiredMaterialInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProcessType.RequiredMaterialInfoList }
     *     
     */
    public ProcessType.RequiredMaterialInfoList getRequiredMaterialInfoList() {
        return requiredMaterialInfoList;
    }

    /**
     * 设置requiredMaterialInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessType.RequiredMaterialInfoList }
     *     
     */
    public void setRequiredMaterialInfoList(ProcessType.RequiredMaterialInfoList value) {
        this.requiredMaterialInfoList = value;
    }

    /**
     * 获取alternativeGroupInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProcessType.AlternativeGroupInfoList }
     *     
     */
    public ProcessType.AlternativeGroupInfoList getAlternativeGroupInfoList() {
        return alternativeGroupInfoList;
    }

    /**
     * 设置alternativeGroupInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessType.AlternativeGroupInfoList }
     *     
     */
    public void setAlternativeGroupInfoList(ProcessType.AlternativeGroupInfoList value) {
        this.alternativeGroupInfoList = value;
    }

    /**
     * 获取alternativeMachineInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProcessType.AlternativeMachineInfoList }
     *     
     */
    public ProcessType.AlternativeMachineInfoList getAlternativeMachineInfoList() {
        return alternativeMachineInfoList;
    }

    /**
     * 设置alternativeMachineInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessType.AlternativeMachineInfoList }
     *     
     */
    public void setAlternativeMachineInfoList(ProcessType.AlternativeMachineInfoList value) {
        this.alternativeMachineInfoList = value;
    }

    /**
     * 获取numOfPersonnel属性的值。
     * 
     */
    public int getNumOfPersonnel() {
        return numOfPersonnel;
    }

    /**
     * 设置numOfPersonnel属性的值。
     * 
     */
    public void setNumOfPersonnel(int value) {
        this.numOfPersonnel = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="alternativeGroupInfo" type="{http://www.oldCompany.com/bom}resourceInfoType"/>
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
        "alternativeGroupInfo"
    })
    public static class AlternativeGroupInfoList {

        @XmlElement(namespace = "http://www.oldCompany.com/bom", required = true)
        protected List<ResourceInfoType> alternativeGroupInfo;

        /**
         * Gets the value of the alternativeGroupInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternativeGroupInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternativeGroupInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResourceInfoType }
         * 
         * 
         */
        public List<ResourceInfoType> getAlternativeGroupInfo() {
            if (alternativeGroupInfo == null) {
                alternativeGroupInfo = new ArrayList<ResourceInfoType>();
            }
            return this.alternativeGroupInfo;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="alternativeMachineInfo" type="{http://www.oldCompany.com/bom}resourceInfoType"/>
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
        "alternativeMachineInfo"
    })
    public static class AlternativeMachineInfoList {

        @XmlElement(namespace = "http://www.oldCompany.com/bom", required = true)
        protected List<ResourceInfoType> alternativeMachineInfo;

        /**
         * Gets the value of the alternativeMachineInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternativeMachineInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternativeMachineInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResourceInfoType }
         * 
         * 
         */
        public List<ResourceInfoType> getAlternativeMachineInfo() {
            if (alternativeMachineInfo == null) {
                alternativeMachineInfo = new ArrayList<ResourceInfoType>();
            }
            return this.alternativeMachineInfo;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="RequiredMaterialInfo" type="{http://www.oldCompany.com/bom}requiredMaterialInfoType"/>
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
        "requiredMaterialInfo"
    })
    public static class RequiredMaterialInfoList {

        @XmlElement(name = "RequiredMaterialInfo", namespace = "http://www.oldCompany.com/bom", required = true)
        protected List<RequiredMaterialInfoType> requiredMaterialInfo;

        /**
         * Gets the value of the requiredMaterialInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requiredMaterialInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequiredMaterialInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequiredMaterialInfoType }
         * 
         * 
         */
        public List<RequiredMaterialInfoType> getRequiredMaterialInfo() {
            if (requiredMaterialInfo == null) {
                requiredMaterialInfo = new ArrayList<RequiredMaterialInfoType>();
            }
            return this.requiredMaterialInfo;
        }

    }

}
