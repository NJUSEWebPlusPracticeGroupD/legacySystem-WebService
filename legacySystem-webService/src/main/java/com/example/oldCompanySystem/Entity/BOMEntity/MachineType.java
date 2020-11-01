//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.09.25 时间 10:16:06 AM CST 
//


package com.example.oldCompanySystem.Entity.BOMEntity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>machineType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="machineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="line"/>
 *     &lt;enumeration value="equipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "machineType")
@XmlEnum
public enum MachineType {

    @XmlEnumValue("line")
    LINE("line"),
    @XmlEnumValue("equipment")
    EQUIPMENT("equipment");
    private final String value;

    MachineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MachineType fromValue(String v) {
        for (MachineType c: MachineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
