
package com.example.oldCompanySystem.Entity.PersonnelEntity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the PersonnelEntity package. 
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

    private final static QName _GetPersonnelRoleByNameParam_QNAME = new QName("http://www.oldCompany.com/personnel", "getPersonnelRoleByNameParam");
    private final static QName _OrderDoesNotExistFault_QNAME = new QName("http://www.oldCompany.com/fault", "OrderDoesNotExistFault");
    private final static QName _GetPersonnelInfoByNameParam_QNAME = new QName("http://www.oldCompany.com/personnel", "getPersonnelInfoByNameParam");
    private final static QName _GetAllOrdersParam_QNAME = new QName("http://www.oldCompany.com/order", "getAllOrdersParam");
    private final static QName _ItemDoesNotExistFault_QNAME = new QName("http://www.oldCompany.com/fault", "ItemDoesNotExistFault");
    private final static QName _GetPersonnelRoleByIdParam_QNAME = new QName("http://www.oldCompany.com/personnel", "getPersonnelRoleByIdParam");
    private final static QName _PersonnelDoesNotExistFault_QNAME = new QName("http://www.oldCompany.com/fault", "PersonnelDoesNotExistFault");
    private final static QName _GroupDoesNotExistFault_QNAME = new QName("http://www.oldCompany.com/fault", "GroupDoesNotExistFault");
    private final static QName _GetPersonnelInfoByIdParam_QNAME = new QName("http://www.oldCompany.com/personnel", "getPersonnelInfoByIdParam");
    private final static QName _OrderInfo_QNAME = new QName("http://www.oldCompany.com/order", "orderInfo");
    private final static QName _PersonnelInfo_QNAME = new QName("http://www.oldCompany.com/personnel", "personnelInfo");
    private final static QName _MachineDoesNotExistFault_QNAME = new QName("http://www.oldCompany.com/fault", "MachineDoesNotExistFault");
    private final static QName _GetOrderByIdParam_QNAME = new QName("http://www.oldCompany.com/order", "getOrderByIdParam");
    private final static QName _MaterielDoesNotExistFault_QNAME = new QName("http://www.oldCompany.com/fault", "MaterielDoesNotExistFault");
    private final static QName _PersonnelRole_QNAME = new QName("http://www.oldCompany.com/personnel", "personnelRole");
    private final static QName _GetOrdersByItemIdParam_QNAME = new QName("http://www.oldCompany.com/order", "getOrdersByItemIdParam");
    private final static QName _GetAllPersonnelInfosParam_QNAME = new QName("http://www.oldCompany.com/personnel", "getAllPersonnelInfosParam");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: PersonnelEntity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPersonnelRoleByIdParamType }
     * 
     */
    public GetPersonnelRoleByIdParamType createGetPersonnelRoleByIdParamType() {
        return new GetPersonnelRoleByIdParamType();
    }

    /**
     * Create an instance of {@link PersonnelInfoList }
     * 
     */
    public PersonnelInfoList createPersonnelInfoList() {
        return new PersonnelInfoList();
    }

    /**
     * Create an instance of {@link PersonnelInfoType }
     * 
     */
    public PersonnelInfoType createPersonnelInfoType() {
        return new PersonnelInfoType();
    }

    /**
     * Create an instance of {@link GetPersonnelInfoByNameParamType }
     * 
     */
    public GetPersonnelInfoByNameParamType createGetPersonnelInfoByNameParamType() {
        return new GetPersonnelInfoByNameParamType();
    }

    /**
     * Create an instance of {@link GetPersonnelRoleByNameParamType }
     * 
     */
    public GetPersonnelRoleByNameParamType createGetPersonnelRoleByNameParamType() {
        return new GetPersonnelRoleByNameParamType();
    }

    /**
     * Create an instance of {@link GetPersonnelInfoByIdParamType }
     * 
     */
    public GetPersonnelInfoByIdParamType createGetPersonnelInfoByIdParamType() {
        return new GetPersonnelInfoByIdParamType();
    }

    /**
     * Create an instance of {@link MaterielDoesNotExistFaultType }
     * 
     */
    public MaterielDoesNotExistFaultType createMaterielDoesNotExistFaultType() {
        return new MaterielDoesNotExistFaultType();
    }

    /**
     * Create an instance of {@link GroupDoesNotExistFaultType }
     * 
     */
    public GroupDoesNotExistFaultType createGroupDoesNotExistFaultType() {
        return new GroupDoesNotExistFaultType();
    }

    /**
     * Create an instance of {@link MachineDoesNotExistFaultType }
     * 
     */
    public MachineDoesNotExistFaultType createMachineDoesNotExistFaultType() {
        return new MachineDoesNotExistFaultType();
    }

    /**
     * Create an instance of {@link OrderDoesNotExistFaultType }
     * 
     */
    public OrderDoesNotExistFaultType createOrderDoesNotExistFaultType() {
        return new OrderDoesNotExistFaultType();
    }

    /**
     * Create an instance of {@link ItemDoesNotExistFaultType }
     * 
     */
    public ItemDoesNotExistFaultType createItemDoesNotExistFaultType() {
        return new ItemDoesNotExistFaultType();
    }

    /**
     * Create an instance of {@link PersonnelDoesNotExistFaultType }
     * 
     */
    public PersonnelDoesNotExistFaultType createPersonnelDoesNotExistFaultType() {
        return new PersonnelDoesNotExistFaultType();
    }

    /**
     * Create an instance of {@link GetOrderByIdType }
     * 
     */
    public GetOrderByIdType createGetOrderByIdType() {
        return new GetOrderByIdType();
    }

    /**
     * Create an instance of {@link OrderInfoType }
     * 
     */
    public OrderInfoType createOrderInfoType() {
        return new OrderInfoType();
    }

    /**
     * Create an instance of {@link OrderList }
     * 
     */
    public OrderList createOrderList() {
        return new OrderList();
    }

    /**
     * Create an instance of {@link GetOrdersByItemIdType }
     * 
     */
    public GetOrdersByItemIdType createGetOrdersByItemIdType() {
        return new GetOrdersByItemIdType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonnelRoleByNameParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/personnel", name = "getPersonnelRoleByNameParam")
    public JAXBElement<GetPersonnelRoleByNameParamType> createGetPersonnelRoleByNameParam(GetPersonnelRoleByNameParamType value) {
        return new JAXBElement<GetPersonnelRoleByNameParamType>(_GetPersonnelRoleByNameParam_QNAME, GetPersonnelRoleByNameParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDoesNotExistFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/fault", name = "OrderDoesNotExistFault")
    public JAXBElement<OrderDoesNotExistFaultType> createOrderDoesNotExistFault(OrderDoesNotExistFaultType value) {
        return new JAXBElement<OrderDoesNotExistFaultType>(_OrderDoesNotExistFault_QNAME, OrderDoesNotExistFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonnelInfoByNameParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/personnel", name = "getPersonnelInfoByNameParam")
    public JAXBElement<GetPersonnelInfoByNameParamType> createGetPersonnelInfoByNameParam(GetPersonnelInfoByNameParamType value) {
        return new JAXBElement<GetPersonnelInfoByNameParamType>(_GetPersonnelInfoByNameParam_QNAME, GetPersonnelInfoByNameParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/order", name = "getAllOrdersParam", defaultValue = "getAllOrders")
    public JAXBElement<String> createGetAllOrdersParam(String value) {
        return new JAXBElement<String>(_GetAllOrdersParam_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemDoesNotExistFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/fault", name = "ItemDoesNotExistFault")
    public JAXBElement<ItemDoesNotExistFaultType> createItemDoesNotExistFault(ItemDoesNotExistFaultType value) {
        return new JAXBElement<ItemDoesNotExistFaultType>(_ItemDoesNotExistFault_QNAME, ItemDoesNotExistFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonnelRoleByIdParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/personnel", name = "getPersonnelRoleByIdParam")
    public JAXBElement<GetPersonnelRoleByIdParamType> createGetPersonnelRoleByIdParam(GetPersonnelRoleByIdParamType value) {
        return new JAXBElement<GetPersonnelRoleByIdParamType>(_GetPersonnelRoleByIdParam_QNAME, GetPersonnelRoleByIdParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonnelDoesNotExistFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/fault", name = "PersonnelDoesNotExistFault")
    public JAXBElement<PersonnelDoesNotExistFaultType> createPersonnelDoesNotExistFault(PersonnelDoesNotExistFaultType value) {
        return new JAXBElement<PersonnelDoesNotExistFaultType>(_PersonnelDoesNotExistFault_QNAME, PersonnelDoesNotExistFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupDoesNotExistFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/fault", name = "GroupDoesNotExistFault")
    public JAXBElement<GroupDoesNotExistFaultType> createGroupDoesNotExistFault(GroupDoesNotExistFaultType value) {
        return new JAXBElement<GroupDoesNotExistFaultType>(_GroupDoesNotExistFault_QNAME, GroupDoesNotExistFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonnelInfoByIdParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/personnel", name = "getPersonnelInfoByIdParam")
    public JAXBElement<GetPersonnelInfoByIdParamType> createGetPersonnelInfoByIdParam(GetPersonnelInfoByIdParamType value) {
        return new JAXBElement<GetPersonnelInfoByIdParamType>(_GetPersonnelInfoByIdParam_QNAME, GetPersonnelInfoByIdParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/order", name = "orderInfo")
    public JAXBElement<OrderInfoType> createOrderInfo(OrderInfoType value) {
        return new JAXBElement<OrderInfoType>(_OrderInfo_QNAME, OrderInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonnelInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/personnel", name = "personnelInfo")
    public JAXBElement<PersonnelInfoType> createPersonnelInfo(PersonnelInfoType value) {
        return new JAXBElement<PersonnelInfoType>(_PersonnelInfo_QNAME, PersonnelInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MachineDoesNotExistFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/fault", name = "MachineDoesNotExistFault")
    public JAXBElement<MachineDoesNotExistFaultType> createMachineDoesNotExistFault(MachineDoesNotExistFaultType value) {
        return new JAXBElement<MachineDoesNotExistFaultType>(_MachineDoesNotExistFault_QNAME, MachineDoesNotExistFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderByIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/order", name = "getOrderByIdParam")
    public JAXBElement<GetOrderByIdType> createGetOrderByIdParam(GetOrderByIdType value) {
        return new JAXBElement<GetOrderByIdType>(_GetOrderByIdParam_QNAME, GetOrderByIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaterielDoesNotExistFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/fault", name = "MaterielDoesNotExistFault")
    public JAXBElement<MaterielDoesNotExistFaultType> createMaterielDoesNotExistFault(MaterielDoesNotExistFaultType value) {
        return new JAXBElement<MaterielDoesNotExistFaultType>(_MaterielDoesNotExistFault_QNAME, MaterielDoesNotExistFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/personnel", name = "personnelRole")
    public JAXBElement<RoleType> createPersonnelRole(RoleType value) {
        return new JAXBElement<RoleType>(_PersonnelRole_QNAME, RoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByItemIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/order", name = "getOrdersByItemIdParam")
    public JAXBElement<GetOrdersByItemIdType> createGetOrdersByItemIdParam(GetOrdersByItemIdType value) {
        return new JAXBElement<GetOrdersByItemIdType>(_GetOrdersByItemIdParam_QNAME, GetOrdersByItemIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oldCompany.com/personnel", name = "getAllPersonnelInfosParam")
    public JAXBElement<String> createGetAllPersonnelInfosParam(String value) {
        return new JAXBElement<String>(_GetAllPersonnelInfosParam_QNAME, String.class, null, value);
    }

}
