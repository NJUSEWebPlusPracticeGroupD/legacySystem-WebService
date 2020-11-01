
package com.example.oldCompanySystem.Entity.PersonnelEntity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>roleType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="roleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="员工"/>
 *     &lt;enumeration value="管理员"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "roleType")
@XmlEnum
public enum RoleType {

    员工,
    管理员;

    public String value() {
        return name();
    }

    public static RoleType fromValue(String v) {
        return valueOf(v);
    }

}
