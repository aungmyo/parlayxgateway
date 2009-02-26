//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.terminal_location.notification_manager.v3_1.local;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.csapi.schema.parlayx.terminal_location.notification_manager.v3_1.local package. 
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

    private final static QName _StartPeriodicNotificationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/terminal_location/notification_manager/v3_1/local", "startPeriodicNotificationResponse");
    private final static QName _StartPeriodicNotification_QNAME = new QName("http://www.csapi.org/schema/parlayx/terminal_location/notification_manager/v3_1/local", "startPeriodicNotification");
    private final static QName _EndNotification_QNAME = new QName("http://www.csapi.org/schema/parlayx/terminal_location/notification_manager/v3_1/local", "endNotification");
    private final static QName _StartGeographicalNotification_QNAME = new QName("http://www.csapi.org/schema/parlayx/terminal_location/notification_manager/v3_1/local", "startGeographicalNotification");
    private final static QName _StartGeographicalNotificationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/terminal_location/notification_manager/v3_1/local", "startGeographicalNotificationResponse");
    private final static QName _EndNotificationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/terminal_location/notification_manager/v3_1/local", "endNotificationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.csapi.schema.parlayx.terminal_location.notification_manager.v3_1.local
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartPeriodicNotificationResponse }
     * 
     */
    public StartPeriodicNotificationResponse createStartPeriodicNotificationResponse() {
        return new StartPeriodicNotificationResponse();
    }

    /**
     * Create an instance of {@link EndNotification }
     * 
     */
    public EndNotification createEndNotification() {
        return new EndNotification();
    }

    /**
     * Create an instance of {@link EndNotificationResponse }
     * 
     */
    public EndNotificationResponse createEndNotificationResponse() {
        return new EndNotificationResponse();
    }

    /**
     * Create an instance of {@link StartGeographicalNotification }
     * 
     */
    public StartGeographicalNotification createStartGeographicalNotification() {
        return new StartGeographicalNotification();
    }

    /**
     * Create an instance of {@link StartPeriodicNotification }
     * 
     */
    public StartPeriodicNotification createStartPeriodicNotification() {
        return new StartPeriodicNotification();
    }

    /**
     * Create an instance of {@link StartGeographicalNotificationResponse }
     * 
     */
    public StartGeographicalNotificationResponse createStartGeographicalNotificationResponse() {
        return new StartGeographicalNotificationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartPeriodicNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/terminal_location/notification_manager/v3_1/local", name = "startPeriodicNotificationResponse")
    public JAXBElement<StartPeriodicNotificationResponse> createStartPeriodicNotificationResponse(StartPeriodicNotificationResponse value) {
        return new JAXBElement<StartPeriodicNotificationResponse>(_StartPeriodicNotificationResponse_QNAME, StartPeriodicNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartPeriodicNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/terminal_location/notification_manager/v3_1/local", name = "startPeriodicNotification")
    public JAXBElement<StartPeriodicNotification> createStartPeriodicNotification(StartPeriodicNotification value) {
        return new JAXBElement<StartPeriodicNotification>(_StartPeriodicNotification_QNAME, StartPeriodicNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/terminal_location/notification_manager/v3_1/local", name = "endNotification")
    public JAXBElement<EndNotification> createEndNotification(EndNotification value) {
        return new JAXBElement<EndNotification>(_EndNotification_QNAME, EndNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartGeographicalNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/terminal_location/notification_manager/v3_1/local", name = "startGeographicalNotification")
    public JAXBElement<StartGeographicalNotification> createStartGeographicalNotification(StartGeographicalNotification value) {
        return new JAXBElement<StartGeographicalNotification>(_StartGeographicalNotification_QNAME, StartGeographicalNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartGeographicalNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/terminal_location/notification_manager/v3_1/local", name = "startGeographicalNotificationResponse")
    public JAXBElement<StartGeographicalNotificationResponse> createStartGeographicalNotificationResponse(StartGeographicalNotificationResponse value) {
        return new JAXBElement<StartGeographicalNotificationResponse>(_StartGeographicalNotificationResponse_QNAME, StartGeographicalNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/terminal_location/notification_manager/v3_1/local", name = "endNotificationResponse")
    public JAXBElement<EndNotificationResponse> createEndNotificationResponse(EndNotificationResponse value) {
        return new JAXBElement<EndNotificationResponse>(_EndNotificationResponse_QNAME, EndNotificationResponse.class, null, value);
    }

}
