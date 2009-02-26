//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package com.nortel.xmlprotocol.wsdl.communications.services.ipc.v1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.xmlprotocol.wsdl.communications.services.ipc.v1_0 package. 
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

    private final static QName _MakeCallResponse_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/", "makeCallResponse");
    private final static QName _BlindTransferRequest_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/", "blindTransferRequest");
    private final static QName _MakeCallRequest_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/", "makeCallRequest");
    private final static QName _BlindTransferResponse_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/", "blindTransferResponse");
    private final static QName _GetStatusRequest_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/", "getStatusRequest");
    private final static QName _GetStatusResponse_QNAME = new QName("http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/", "getStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.xmlprotocol.wsdl.communications.services.ipc.v1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatusRequestType }
     * 
     */
    public GetStatusRequestType createGetStatusRequestType() {
        return new GetStatusRequestType();
    }

    /**
     * Create an instance of {@link MakeCallRequestType }
     * 
     */
    public MakeCallRequestType createMakeCallRequestType() {
        return new MakeCallRequestType();
    }

    /**
     * Create an instance of {@link BlindTransferRequestType }
     * 
     */
    public BlindTransferRequestType createBlindTransferRequestType() {
        return new BlindTransferRequestType();
    }

    /**
     * Create an instance of {@link GetStatusResponseType }
     * 
     */
    public GetStatusResponseType createGetStatusResponseType() {
        return new GetStatusResponseType();
    }

    /**
     * Create an instance of {@link BlindTransferResponseType }
     * 
     */
    public BlindTransferResponseType createBlindTransferResponseType() {
        return new BlindTransferResponseType();
    }

    /**
     * Create an instance of {@link MakeCallResponseType }
     * 
     */
    public MakeCallResponseType createMakeCallResponseType() {
        return new MakeCallResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeCallResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/", name = "makeCallResponse")
    public JAXBElement<MakeCallResponseType> createMakeCallResponse(MakeCallResponseType value) {
        return new JAXBElement<MakeCallResponseType>(_MakeCallResponse_QNAME, MakeCallResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlindTransferRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/", name = "blindTransferRequest")
    public JAXBElement<BlindTransferRequestType> createBlindTransferRequest(BlindTransferRequestType value) {
        return new JAXBElement<BlindTransferRequestType>(_BlindTransferRequest_QNAME, BlindTransferRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeCallRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/", name = "makeCallRequest")
    public JAXBElement<MakeCallRequestType> createMakeCallRequest(MakeCallRequestType value) {
        return new JAXBElement<MakeCallRequestType>(_MakeCallRequest_QNAME, MakeCallRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlindTransferResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/", name = "blindTransferResponse")
    public JAXBElement<BlindTransferResponseType> createBlindTransferResponse(BlindTransferResponseType value) {
        return new JAXBElement<BlindTransferResponseType>(_BlindTransferResponse_QNAME, BlindTransferResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/", name = "getStatusRequest")
    public JAXBElement<GetStatusRequestType> createGetStatusRequest(GetStatusRequestType value) {
        return new JAXBElement<GetStatusRequestType>(_GetStatusRequest_QNAME, GetStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/", name = "getStatusResponse")
    public JAXBElement<GetStatusResponseType> createGetStatusResponse(GetStatusResponseType value) {
        return new JAXBElement<GetStatusResponseType>(_GetStatusResponse_QNAME, GetStatusResponseType.class, null, value);
    }

}
