//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.09.25 时间 10:16:06 AM CST 
//


package com.example.oldCompanySystem.Entity.BOMEntity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemPropertyType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemPropertyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="成品"/>
 *     &lt;enumeration value="半成品"/>
 *     &lt;enumeration value="原材料"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemPropertyType")
@XmlEnum
public enum ItemPropertyType {

    成品,
    半成品,
    原材料;

    public String value() {
        return name();
    }

    public static ItemPropertyType fromValue(String v) {
        return valueOf(v);
    }

}