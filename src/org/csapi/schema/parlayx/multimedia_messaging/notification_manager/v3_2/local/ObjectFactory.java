//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.multimedia_messaging.notification_manager.v3_2.local;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.csapi.schema.parlayx.multimedia_messaging.notification_manager.v3_2.local package. 
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

    private final static QName _StopDeliveryReceiptNotificationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", "stopDeliveryReceiptNotificationResponse");
    private final static QName _StartMessageNotificationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", "startMessageNotificationResponse");
    private final static QName _StopDeliveryReceiptNotification_QNAME = new QName("http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", "stopDeliveryReceiptNotification");
    private final static QName _StartDeliveryReceiptNotificationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", "startDeliveryReceiptNotificationResponse");
    private final static QName _StartDeliveryReceiptNotification_QNAME = new QName("http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", "startDeliveryReceiptNotification");
    private final static QName _StartMessageNotification_QNAME = new QName("http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", "startMessageNotification");
    private final static QName _StopMessageNotificationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", "stopMessageNotificationResponse");
    private final static QName _StopMessageNotification_QNAME = new QName("http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", "stopMessageNotification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.csapi.schema.parlayx.multimedia_messaging.notification_manager.v3_2.local
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartDeliveryReceiptNotification }
     * 
     */
    public StartDeliveryReceiptNotification createStartDeliveryReceiptNotification() {
        return new StartDeliveryReceiptNotification();
    }

    /**
     * Create an instance of {@link StopMessageNotification }
     * 
     */
    public StopMessageNotification createStopMessageNotification() {
        return new StopMessageNotification();
    }

    /**
     * Create an instance of {@link StartDeliveryReceiptNotificationResponse }
     * 
     */
    public StartDeliveryReceiptNotificationResponse createStartDeliveryReceiptNotificationResponse() {
        return new StartDeliveryReceiptNotificationResponse();
    }

    /**
     * Create an instance of {@link StartMessageNotificationResponse }
     * 
     */
    public StartMessageNotificationResponse createStartMessageNotificationResponse() {
        return new StartMessageNotificationResponse();
    }

    /**
     * Create an instance of {@link StopDeliveryReceiptNotification }
     * 
     */
    public StopDeliveryReceiptNotification createStopDeliveryReceiptNotification() {
        return new StopDeliveryReceiptNotification();
    }

    /**
     * Create an instance of {@link StopMessageNotificationResponse }
     * 
     */
    public StopMessageNotificationResponse createStopMessageNotificationResponse() {
        return new StopMessageNotificationResponse();
    }

    /**
     * Create an instance of {@link StopDeliveryReceiptNotificationResponse }
     * 
     */
    public StopDeliveryReceiptNotificationResponse createStopDeliveryReceiptNotificationResponse() {
        return new StopDeliveryReceiptNotificationResponse();
    }

    /**
     * Create an instance of {@link StartMessageNotification }
     * 
     */
    public StartMessageNotification createStartMessageNotification() {
        return new StartMessageNotification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopDeliveryReceiptNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", name = "stopDeliveryReceiptNotificationResponse")
    public JAXBElement<StopDeliveryReceiptNotificationResponse> createStopDeliveryReceiptNotificationResponse(StopDeliveryReceiptNotificationResponse value) {
        return new JAXBElement<StopDeliveryReceiptNotificationResponse>(_StopDeliveryReceiptNotificationResponse_QNAME, StopDeliveryReceiptNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartMessageNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", name = "startMessageNotificationResponse")
    public JAXBElement<StartMessageNotificationResponse> createStartMessageNotificationResponse(StartMessageNotificationResponse value) {
        return new JAXBElement<StartMessageNotificationResponse>(_StartMessageNotificationResponse_QNAME, StartMessageNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopDeliveryReceiptNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", name = "stopDeliveryReceiptNotification")
    public JAXBElement<StopDeliveryReceiptNotification> createStopDeliveryReceiptNotification(StopDeliveryReceiptNotification value) {
        return new JAXBElement<StopDeliveryReceiptNotification>(_StopDeliveryReceiptNotification_QNAME, StopDeliveryReceiptNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDeliveryReceiptNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", name = "startDeliveryReceiptNotificationResponse")
    public JAXBElement<StartDeliveryReceiptNotificationResponse> createStartDeliveryReceiptNotificationResponse(StartDeliveryReceiptNotificationResponse value) {
        return new JAXBElement<StartDeliveryReceiptNotificationResponse>(_StartDeliveryReceiptNotificationResponse_QNAME, StartDeliveryReceiptNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDeliveryReceiptNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", name = "startDeliveryReceiptNotification")
    public JAXBElement<StartDeliveryReceiptNotification> createStartDeliveryReceiptNotification(StartDeliveryReceiptNotification value) {
        return new JAXBElement<StartDeliveryReceiptNotification>(_StartDeliveryReceiptNotification_QNAME, StartDeliveryReceiptNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartMessageNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", name = "startMessageNotification")
    public JAXBElement<StartMessageNotification> createStartMessageNotification(StartMessageNotification value) {
        return new JAXBElement<StartMessageNotification>(_StartMessageNotification_QNAME, StartMessageNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMessageNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", name = "stopMessageNotificationResponse")
    public JAXBElement<StopMessageNotificationResponse> createStopMessageNotificationResponse(StopMessageNotificationResponse value) {
        return new JAXBElement<StopMessageNotificationResponse>(_StopMessageNotificationResponse_QNAME, StopMessageNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMessageNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/multimedia_messaging/notification_manager/v3_2/local", name = "stopMessageNotification")
    public JAXBElement<StopMessageNotification> createStopMessageNotification(StopMessageNotification value) {
        return new JAXBElement<StopMessageNotification>(_StopMessageNotification_QNAME, StopMessageNotification.class, null, value);
    }

}
