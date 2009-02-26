//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.call_direction.v3_2.local;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.csapi.schema.parlayx.call_direction.v3_2.local package. 
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

    private final static QName _HandleBusyResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", "handleBusyResponse");
    private final static QName _HandleNotReachable_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", "handleNotReachable");
    private final static QName _HandleBusy_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", "handleBusy");
    private final static QName _HandleNoAnswerResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", "handleNoAnswerResponse");
    private final static QName _HandleNotReachableResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", "handleNotReachableResponse");
    private final static QName _HandleNoAnswer_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", "handleNoAnswer");
    private final static QName _HandleCalledNumber_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", "handleCalledNumber");
    private final static QName _HandleCalledNumberResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", "handleCalledNumberResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.csapi.schema.parlayx.call_direction.v3_2.local
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HandleCalledNumberResponse }
     * 
     */
    public HandleCalledNumberResponse createHandleCalledNumberResponse() {
        return new HandleCalledNumberResponse();
    }

    /**
     * Create an instance of {@link HandleNoAnswer }
     * 
     */
    public HandleNoAnswer createHandleNoAnswer() {
        return new HandleNoAnswer();
    }

    /**
     * Create an instance of {@link HandleBusy }
     * 
     */
    public HandleBusy createHandleBusy() {
        return new HandleBusy();
    }

    /**
     * Create an instance of {@link HandleNoAnswerResponse }
     * 
     */
    public HandleNoAnswerResponse createHandleNoAnswerResponse() {
        return new HandleNoAnswerResponse();
    }

    /**
     * Create an instance of {@link HandleNotReachableResponse }
     * 
     */
    public HandleNotReachableResponse createHandleNotReachableResponse() {
        return new HandleNotReachableResponse();
    }

    /**
     * Create an instance of {@link HandleNotReachable }
     * 
     */
    public HandleNotReachable createHandleNotReachable() {
        return new HandleNotReachable();
    }

    /**
     * Create an instance of {@link HandleBusyResponse }
     * 
     */
    public HandleBusyResponse createHandleBusyResponse() {
        return new HandleBusyResponse();
    }

    /**
     * Create an instance of {@link HandleCalledNumber }
     * 
     */
    public HandleCalledNumber createHandleCalledNumber() {
        return new HandleCalledNumber();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleBusyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", name = "handleBusyResponse")
    public JAXBElement<HandleBusyResponse> createHandleBusyResponse(HandleBusyResponse value) {
        return new JAXBElement<HandleBusyResponse>(_HandleBusyResponse_QNAME, HandleBusyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleNotReachable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", name = "handleNotReachable")
    public JAXBElement<HandleNotReachable> createHandleNotReachable(HandleNotReachable value) {
        return new JAXBElement<HandleNotReachable>(_HandleNotReachable_QNAME, HandleNotReachable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleBusy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", name = "handleBusy")
    public JAXBElement<HandleBusy> createHandleBusy(HandleBusy value) {
        return new JAXBElement<HandleBusy>(_HandleBusy_QNAME, HandleBusy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleNoAnswerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", name = "handleNoAnswerResponse")
    public JAXBElement<HandleNoAnswerResponse> createHandleNoAnswerResponse(HandleNoAnswerResponse value) {
        return new JAXBElement<HandleNoAnswerResponse>(_HandleNoAnswerResponse_QNAME, HandleNoAnswerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleNotReachableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", name = "handleNotReachableResponse")
    public JAXBElement<HandleNotReachableResponse> createHandleNotReachableResponse(HandleNotReachableResponse value) {
        return new JAXBElement<HandleNotReachableResponse>(_HandleNotReachableResponse_QNAME, HandleNotReachableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleNoAnswer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", name = "handleNoAnswer")
    public JAXBElement<HandleNoAnswer> createHandleNoAnswer(HandleNoAnswer value) {
        return new JAXBElement<HandleNoAnswer>(_HandleNoAnswer_QNAME, HandleNoAnswer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleCalledNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", name = "handleCalledNumber")
    public JAXBElement<HandleCalledNumber> createHandleCalledNumber(HandleCalledNumber value) {
        return new JAXBElement<HandleCalledNumber>(_HandleCalledNumber_QNAME, HandleCalledNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleCalledNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_direction/v3_2/local", name = "handleCalledNumberResponse")
    public JAXBElement<HandleCalledNumberResponse> createHandleCalledNumberResponse(HandleCalledNumberResponse value) {
        return new JAXBElement<HandleCalledNumberResponse>(_HandleCalledNumberResponse_QNAME, HandleCalledNumberResponse.class, null, value);
    }

}
