//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.09.25 时间 10:16:06 AM CST 
//


package com.example.oldCompanySystem.Entity.BOMEntity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.oldCompanySystem.Entity.BOMEntity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllMachineInfosParam_QNAME = new QName("http://www.oldCompany.com/erp", "getAllMachineInfosParam");
    private final static QName _GetGroupInfoByIdParam_QNAME = new QName("http://www.oldCompany.com/erp", "getGroupInfoByIdParam");
    private final static QName _GetMachineInfosByTypeParam_QNAME = new QName("http://www.oldCompany.com/erp", "getMachineInfosByTypeParam");
    private final static QName _GetItemInfoByIdParam_QNAME = new QName("http://www.oldCompany.com/erp", "getItemInfoByIdParam");
    private final static QName _MachineInfo_QNAME = new QName("http://www.oldCompany.com/erp", "MachineInfo");
    private final static QName _GetAllItemInfosParam_QNAME = new QName("http://www.oldCompany.com/erp", "getAllItemInfosParam");
    private final static QName _ItemInfo_QNAME = new QName("http://www.oldCompany.com/erp", "ItemInfo");
    private final static QName _GroupInfo_QNAME = new QName("http://www.oldCompany.com/erp", "GroupInfo");
    private final static QName _GetGroupInfoByMemberNameParam_QNAME = new QName("http://www.oldCompany.com/erp", "getGroupInfoByMemberNameParam");
    private final static QName _GetMachineInfoByNameParam_QNAME = new QName("http://www.oldCompany.com/erp", "getMachineInfoByNameParam");
    private final static QName _GetAllBOMsParam_QNAME = new QName("http://www.oldCompany.com/bom", "getAllBOMsParam");
    private final static QName _GetAllGroupInfosParam_QNAME = new QName("http://www.oldCompany.com/erp", "getAllGroupInfosParam");
    private final static QName _BOMInfo_QNAME = new QName("http://www.oldCompany.com/bom", "BOMInfo");
    private final static QName _GetBOMByItemIdParam_QNAME = new QName("http://www.oldCompany.com/bom", "getBOMByItemIdParam");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.oldCompanySystem.Entity.BOMEntity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessType }
     * 
     */
    public ProcessType createProcessType() {
        return new ProcessType();
    }

    /**
     * Create an instance of {@link BOMType }
     * 
     */
    public BOMType createBOMType() {
        return new BOMType();
    }

    /**
     * Create an instance of {@link BOMList }
     * 
     */
    public BOMList createBOMList() {
        return new BOMList();
    }

    /**
     * Create an instance of {@link GetBOMByItemIdParamType }
     * 
     */
    public GetBOMByItemIdParamType createGetBOMByItemIdParamType() {
        return new GetBOMByItemIdParamType();
    }

    /**
     * Create an instance of {@link ResourceInfoType }
     * 
     */
    public ResourceInfoType createResourceInfoType() {
        return new ResourceInfoType();
    }

    /**
     * Create an instance of {@link RequiredMaterialInfoType }
     * 
     */
    public RequiredMaterialInfoType createRequiredMaterialInfoType() {
        return new RequiredMaterialInfoType();
    }

    /**
     * Create an instance of {@link GetGroupInfoByMemberNameParamType }
     * 
     */
    public GetGroupInfoByMemberNameParamType createGetGroupInfoByMemberNameParamType() {
        return new GetGroupInfoByMemberNameParamType();
    }

    /**
     * Create an instance of {@link GetMachineInfoByNameParamType }
     * 
     */
    public GetMachineInfoByNameParamType createGetMachineInfoByNameParamType() {
        return new GetMachineInfoByNameParamType();
    }

    /**
     * Create an instance of {@link GroupInfoList }
     * 
     */
    public GroupInfoList createGroupInfoList() {
        return new GroupInfoList();
    }

    /**
     * Create an instance of {@link GroupInformationType }
     * 
     */
    public GroupInformationType createGroupInformationType() {
        return new GroupInformationType();
    }

    /**
     * Create an instance of {@link ItemInfoType }
     * 
     */
    public ItemInfoType createItemInfoType() {
        return new ItemInfoType();
    }

    /**
     * Create an instance of {@link ItemInfoList }
     * 
     */
    public ItemInfoList createItemInfoList() {
        return new ItemInfoList();
    }

    /**
     * Create an instance of {@link GetMachineInfosByTypeParamType }
     * 
     */
    public GetMachineInfosByTypeParamType createGetMachineInfosByTypeParamType() {
        return new GetMachineInfosByTypeParamType();
    }

    /**
     * Create an instance of {@link GetItemInfoByIdParamType }
     * 
     */
    public GetItemInfoByIdParamType createGetItemInfoByIdParamType() {
        return new GetItemInfoByIdParamType();
    }

    /**
     * Create an instance of {@link MachineInfoType }
     * 
     */
    public MachineInfoType createMachineInfoType() {
        return new MachineInfoType();
    }

    /**
     * Create an instance of {@link GetGroupInfoByIdParamType }
     * 
     */
    public GetGroupInfoByIdParamType createGetGroupInfoByIdParamType() {
        return new GetGroupInfoByIdParamType();
    }

    /**
     * Create an instance of {@link MachineInfoList }
     * 
     */
    public MachineInfoList createMachineInfoList() {
        return new MachineInfoList();
    }

    /**
     * Create an instance of {@link ProcessType.RequiredMaterialInfoList }
     * 
     */
    public ProcessType.RequiredMaterialInfoList createProcessTypeRequiredMaterialInfoList() {
        return new ProcessType.RequiredMaterialInfoList();
    }

    /**
     * Create an instance of {@link ProcessType.AlternativeGroupInfoList }
     * 
     */
    public ProcessType.AlternativeGroupInfoList createProcessTypeAlternativeGroupInfoList() {
        return new ProcessType.AlternativeGroupInfoList();
    }

    /**
     * Create an instance of {@link ProcessType.AlternativeMachineInfoList }
     * 
     */
    public ProcessType.AlternativeMachineInfoList createProcessTypeAlternativeMachineInfoList() {
        return new ProcessType.AlternativeMachineInfoList();
    }

    /**
     * Create an instance of {@link BOMType.ProcessList }
     * 
     */
    public BOMType.ProcessList createBOMTypeProcessList() {
        return new BOMType.ProcessList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/erp", name = "getAllMachineInfosParam")
    public JAXBElement<String> createGetAllMachineInfosParam(String value) {
        return new JAXBElement<String>(_GetAllMachineInfosParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGroupInfoByIdParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/erp", name = "getGroupInfoByIdParam")
    public JAXBElement<GetGroupInfoByIdParamType> createGetGroupInfoByIdParam(GetGroupInfoByIdParamType value) {
        return new JAXBElement<GetGroupInfoByIdParamType>(_GetGroupInfoByIdParam_QNAME, GetGroupInfoByIdParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMachineInfosByTypeParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/erp", name = "getMachineInfosByTypeParam")
    public JAXBElement<GetMachineInfosByTypeParamType> createGetMachineInfosByTypeParam(GetMachineInfosByTypeParamType value) {
        return new JAXBElement<GetMachineInfosByTypeParamType>(_GetMachineInfosByTypeParam_QNAME, GetMachineInfosByTypeParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemInfoByIdParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/erp", name = "getItemInfoByIdParam")
    public JAXBElement<GetItemInfoByIdParamType> createGetItemInfoByIdParam(GetItemInfoByIdParamType value) {
        return new JAXBElement<GetItemInfoByIdParamType>(_GetItemInfoByIdParam_QNAME, GetItemInfoByIdParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MachineInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/erp", name = "MachineInfo")
    public JAXBElement<MachineInfoType> createMachineInfo(MachineInfoType value) {
        return new JAXBElement<MachineInfoType>(_MachineInfo_QNAME, MachineInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/erp", name = "getAllItemInfosParam")
    public JAXBElement<String> createGetAllItemInfosParam(String value) {
        return new JAXBElement<String>(_GetAllItemInfosParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/erp", name = "ItemInfo")
    public JAXBElement<ItemInfoType> createItemInfo(ItemInfoType value) {
        return new JAXBElement<ItemInfoType>(_ItemInfo_QNAME, ItemInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/erp", name = "GroupInfo")
    public JAXBElement<GroupInformationType> createGroupInfo(GroupInformationType value) {
        return new JAXBElement<GroupInformationType>(_GroupInfo_QNAME, GroupInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGroupInfoByMemberNameParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/erp", name = "getGroupInfoByMemberNameParam")
    public JAXBElement<GetGroupInfoByMemberNameParamType> createGetGroupInfoByMemberNameParam(GetGroupInfoByMemberNameParamType value) {
        return new JAXBElement<GetGroupInfoByMemberNameParamType>(_GetGroupInfoByMemberNameParam_QNAME, GetGroupInfoByMemberNameParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMachineInfoByNameParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/erp", name = "getMachineInfoByNameParam")
    public JAXBElement<GetMachineInfoByNameParamType> createGetMachineInfoByNameParam(GetMachineInfoByNameParamType value) {
        return new JAXBElement<GetMachineInfoByNameParamType>(_GetMachineInfoByNameParam_QNAME, GetMachineInfoByNameParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/bom", name = "getAllBOMsParam", defaultValue = "getAllBOMs")
    public JAXBElement<String> createGetAllBOMsParam(String value) {
        return new JAXBElement<String>(_GetAllBOMsParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/erp", name = "getAllGroupInfosParam")
    public JAXBElement<String> createGetAllGroupInfosParam(String value) {
        return new JAXBElement<String>(_GetAllGroupInfosParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/bom", name = "BOMInfo")
    public JAXBElement<BOMType> createBOMInfo(BOMType value) {
        return new JAXBElement<BOMType>(_BOMInfo_QNAME, BOMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBOMByItemIdParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/bom", name = "getBOMByItemIdParam")
    public JAXBElement<GetBOMByItemIdParamType> createGetBOMByItemIdParam(GetBOMByItemIdParamType value) {
        return new JAXBElement<GetBOMByItemIdParamType>(_GetBOMByItemIdParam_QNAME, GetBOMByItemIdParamType.class, null, value);
    }

}
