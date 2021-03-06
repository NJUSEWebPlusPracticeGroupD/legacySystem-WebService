
package com.example.oldCompanySystem.Entity.ERPEntity;

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
 *         &lt;element name="ItemInfo" type="{http://www.oldCompany.com/erp}ItemInfoType"/>
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
    "itemInfo"
})
@XmlRootElement(name = "ItemInfoList")
public class ItemInfoList {

    public void setItemInfo(List<ItemInfoType> itemInfo) {
        this.itemInfo = itemInfo;
    }

    @XmlElement(name = "ItemInfo")
    protected List<ItemInfoType> itemInfo;

    /**
     * Gets the value of the itemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInfoType }
     * 
     * 
     */
    public List<ItemInfoType> getItemInfo() {
        if (itemInfo == null) {
            itemInfo = new ArrayList<ItemInfoType>();
        }
        return this.itemInfo;
    }

}
