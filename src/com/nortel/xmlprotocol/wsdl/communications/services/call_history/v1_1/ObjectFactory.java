//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package com.nortel.xmlprotocol.wsdl.communications.services.call_history.v1_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.xmlprotocol.wsdl.communications.services.call_history.v1_1 package. 
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

    private final static QName _GetCallHistoryByProfileResponse_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", "getCallHistoryByProfileResponse");
    private final static QName _DeregisterCallHistoryResponse_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", "deregisterCallHistoryResponse");
    private final static QName _RegisterCallHistoryResponse_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", "registerCallHistoryResponse");
    private final static QName _GetCallHistory_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", "getCallHistory");
    private final static QName _DeregisterCallHistory_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", "deregisterCallHistory");
    private final static QName _RegisterCallHistory_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", "registerCallHistory");
    private final static QName _GetCallHistoryResponse_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", "getCallHistoryResponse");
    private final static QName _GetCallHistoryByProfile_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", "getCallHistoryByProfile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.xmlprotocol.wsdl.communications.services.call_history.v1_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterCallHistoryResponse }
     * 
     */
    public RegisterCallHistoryResponse createRegisterCallHistoryResponse() {
        return new RegisterCallHistoryResponse();
    }

    /**
     * Create an instance of {@link RegisterCallHistory }
     * 
     */
    public RegisterCallHistory createRegisterCallHistory() {
        return new RegisterCallHistory();
    }

    /**
     * Create an instance of {@link DeregisterCallHistoryResponse }
     * 
     */
    public DeregisterCallHistoryResponse createDeregisterCallHistoryResponse() {
        return new DeregisterCallHistoryResponse();
    }

    /**
     * Create an instance of {@link GetCallHistoryByProfile }
     * 
     */
    public GetCallHistoryByProfile createGetCallHistoryByProfile() {
        return new GetCallHistoryByProfile();
    }

    /**
     * Create an instance of {@link DeregisterCallHistory }
     * 
     */
    public DeregisterCallHistory createDeregisterCallHistory() {
        return new DeregisterCallHistory();
    }

    /**
     * Create an instance of {@link GetCallHistoryByProfileResponse }
     * 
     */
    public GetCallHistoryByProfileResponse createGetCallHistoryByProfileResponse() {
        return new GetCallHistoryByProfileResponse();
    }

    /**
     * Create an instance of {@link CallRecordCollection }
     * 
     */
    public CallRecordCollection createCallRecordCollection() {
        return new CallRecordCollection();
    }

    /**
     * Create an instance of {@link ProfileCallHistory }
     * 
     */
    public ProfileCallHistory createProfileCallHistory() {
        return new ProfileCallHistory();
    }

    /**
     * Create an instance of {@link GetCallHistory }
     * 
     */
    public GetCallHistory createGetCallHistory() {
        return new GetCallHistory();
    }

    /**
     * Create an instance of {@link CallRecord }
     * 
     */
    public CallRecord createCallRecord() {
        return new CallRecord();
    }

    /**
     * Create an instance of {@link AddressCallHistory }
     * 
     */
    public AddressCallHistory createAddressCallHistory() {
        return new AddressCallHistory();
    }

    /**
     * Create an instance of {@link GetCallHistoryResponse }
     * 
     */
    public GetCallHistoryResponse createGetCallHistoryResponse() {
        return new GetCallHistoryResponse();
    }

    /**
     * Create an instance of {@link RegistrationResult }
     * 
     */
    public RegistrationResult createRegistrationResult() {
        return new RegistrationResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCallHistoryByProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", name = "getCallHistoryByProfileResponse")
    public JAXBElement<GetCallHistoryByProfileResponse> createGetCallHistoryByProfileResponse(GetCallHistoryByProfileResponse value) {
        return new JAXBElement<GetCallHistoryByProfileResponse>(_GetCallHistoryByProfileResponse_QNAME, GetCallHistoryByProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeregisterCallHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", name = "deregisterCallHistoryResponse")
    public JAXBElement<DeregisterCallHistoryResponse> createDeregisterCallHistoryResponse(DeregisterCallHistoryResponse value) {
        return new JAXBElement<DeregisterCallHistoryResponse>(_DeregisterCallHistoryResponse_QNAME, DeregisterCallHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCallHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", name = "registerCallHistoryResponse")
    public JAXBElement<RegisterCallHistoryResponse> createRegisterCallHistoryResponse(RegisterCallHistoryResponse value) {
        return new JAXBElement<RegisterCallHistoryResponse>(_RegisterCallHistoryResponse_QNAME, RegisterCallHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCallHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", name = "getCallHistory")
    public JAXBElement<GetCallHistory> createGetCallHistory(GetCallHistory value) {
        return new JAXBElement<GetCallHistory>(_GetCallHistory_QNAME, GetCallHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeregisterCallHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", name = "deregisterCallHistory")
    public JAXBElement<DeregisterCallHistory> createDeregisterCallHistory(DeregisterCallHistory value) {
        return new JAXBElement<DeregisterCallHistory>(_DeregisterCallHistory_QNAME, DeregisterCallHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCallHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", name = "registerCallHistory")
    public JAXBElement<RegisterCallHistory> createRegisterCallHistory(RegisterCallHistory value) {
        return new JAXBElement<RegisterCallHistory>(_RegisterCallHistory_QNAME, RegisterCallHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCallHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", name = "getCallHistoryResponse")
    public JAXBElement<GetCallHistoryResponse> createGetCallHistoryResponse(GetCallHistoryResponse value) {
        return new JAXBElement<GetCallHistoryResponse>(_GetCallHistoryResponse_QNAME, GetCallHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCallHistoryByProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/call_history/v1_1/", name = "getCallHistoryByProfile")
    public JAXBElement<GetCallHistoryByProfile> createGetCallHistoryByProfile(GetCallHistoryByProfile value) {
        return new JAXBElement<GetCallHistoryByProfile>(_GetCallHistoryByProfile_QNAME, GetCallHistoryByProfile.class, null, value);
    }

}