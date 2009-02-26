//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.call_notification.notification_manager.v3_8.local;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.csapi.schema.parlayx.call_notification.notification_manager.v3_8.local package. 
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

    private final static QName _StopMediaInteractionNotification_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", "stopMediaInteractionNotification");
    private final static QName _StopCallNotification_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", "stopCallNotification");
    private final static QName _StopMediaInteractionNotificationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", "stopMediaInteractionNotificationResponse");
    private final static QName _StartPlayAndRecordNotificationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", "startPlayAndRecordNotificationResponse");
    private final static QName _StartPlayAndCollectNotificationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", "startPlayAndCollectNotificationResponse");
    private final static QName _StartPlayAndCollectNotification_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", "startPlayAndCollectNotification");
    private final static QName _StartPlayAndRecordNotification_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", "startPlayAndRecordNotification");
    private final static QName _StartCallNotification_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", "startCallNotification");
    private final static QName _StopCallNotificationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", "stopCallNotificationResponse");
    private final static QName _StartCallNotificationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", "startCallNotificationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.csapi.schema.parlayx.call_notification.notification_manager.v3_8.local
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StopCallNotification }
     * 
     */
    public StopCallNotification createStopCallNotification() {
        return new StopCallNotification();
    }

    /**
     * Create an instance of {@link StartPlayAndCollectNotification }
     * 
     */
    public StartPlayAndCollectNotification createStartPlayAndCollectNotification() {
        return new StartPlayAndCollectNotification();
    }

    /**
     * Create an instance of {@link StartPlayAndCollectNotificationResponse }
     * 
     */
    public StartPlayAndCollectNotificationResponse createStartPlayAndCollectNotificationResponse() {
        return new StartPlayAndCollectNotificationResponse();
    }

    /**
     * Create an instance of {@link StopMediaInteractionNotification }
     * 
     */
    public StopMediaInteractionNotification createStopMediaInteractionNotification() {
        return new StopMediaInteractionNotification();
    }

    /**
     * Create an instance of {@link StartCallNotificationResponse }
     * 
     */
    public StartCallNotificationResponse createStartCallNotificationResponse() {
        return new StartCallNotificationResponse();
    }

    /**
     * Create an instance of {@link StartPlayAndRecordNotificationResponse }
     * 
     */
    public StartPlayAndRecordNotificationResponse createStartPlayAndRecordNotificationResponse() {
        return new StartPlayAndRecordNotificationResponse();
    }

    /**
     * Create an instance of {@link StartCallNotification }
     * 
     */
    public StartCallNotification createStartCallNotification() {
        return new StartCallNotification();
    }

    /**
     * Create an instance of {@link StopCallNotificationResponse }
     * 
     */
    public StopCallNotificationResponse createStopCallNotificationResponse() {
        return new StopCallNotificationResponse();
    }

    /**
     * Create an instance of {@link StopMediaInteractionNotificationResponse }
     * 
     */
    public StopMediaInteractionNotificationResponse createStopMediaInteractionNotificationResponse() {
        return new StopMediaInteractionNotificationResponse();
    }

    /**
     * Create an instance of {@link StartPlayAndRecordNotification }
     * 
     */
    public StartPlayAndRecordNotification createStartPlayAndRecordNotification() {
        return new StartPlayAndRecordNotification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMediaInteractionNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", name = "stopMediaInteractionNotification")
    public JAXBElement<StopMediaInteractionNotification> createStopMediaInteractionNotification(StopMediaInteractionNotification value) {
        return new JAXBElement<StopMediaInteractionNotification>(_StopMediaInteractionNotification_QNAME, StopMediaInteractionNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopCallNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", name = "stopCallNotification")
    public JAXBElement<StopCallNotification> createStopCallNotification(StopCallNotification value) {
        return new JAXBElement<StopCallNotification>(_StopCallNotification_QNAME, StopCallNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMediaInteractionNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", name = "stopMediaInteractionNotificationResponse")
    public JAXBElement<StopMediaInteractionNotificationResponse> createStopMediaInteractionNotificationResponse(StopMediaInteractionNotificationResponse value) {
        return new JAXBElement<StopMediaInteractionNotificationResponse>(_StopMediaInteractionNotificationResponse_QNAME, StopMediaInteractionNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartPlayAndRecordNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", name = "startPlayAndRecordNotificationResponse")
    public JAXBElement<StartPlayAndRecordNotificationResponse> createStartPlayAndRecordNotificationResponse(StartPlayAndRecordNotificationResponse value) {
        return new JAXBElement<StartPlayAndRecordNotificationResponse>(_StartPlayAndRecordNotificationResponse_QNAME, StartPlayAndRecordNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartPlayAndCollectNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", name = "startPlayAndCollectNotificationResponse")
    public JAXBElement<StartPlayAndCollectNotificationResponse> createStartPlayAndCollectNotificationResponse(StartPlayAndCollectNotificationResponse value) {
        return new JAXBElement<StartPlayAndCollectNotificationResponse>(_StartPlayAndCollectNotificationResponse_QNAME, StartPlayAndCollectNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartPlayAndCollectNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", name = "startPlayAndCollectNotification")
    public JAXBElement<StartPlayAndCollectNotification> createStartPlayAndCollectNotification(StartPlayAndCollectNotification value) {
        return new JAXBElement<StartPlayAndCollectNotification>(_StartPlayAndCollectNotification_QNAME, StartPlayAndCollectNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartPlayAndRecordNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", name = "startPlayAndRecordNotification")
    public JAXBElement<StartPlayAndRecordNotification> createStartPlayAndRecordNotification(StartPlayAndRecordNotification value) {
        return new JAXBElement<StartPlayAndRecordNotification>(_StartPlayAndRecordNotification_QNAME, StartPlayAndRecordNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartCallNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", name = "startCallNotification")
    public JAXBElement<StartCallNotification> createStartCallNotification(StartCallNotification value) {
        return new JAXBElement<StartCallNotification>(_StartCallNotification_QNAME, StartCallNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopCallNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", name = "stopCallNotificationResponse")
    public JAXBElement<StopCallNotificationResponse> createStopCallNotificationResponse(StopCallNotificationResponse value) {
        return new JAXBElement<StopCallNotificationResponse>(_StopCallNotificationResponse_QNAME, StopCallNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartCallNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/call_notification/notification_manager/v3_8/local", name = "startCallNotificationResponse")
    public JAXBElement<StartCallNotificationResponse> createStartCallNotificationResponse(StartCallNotificationResponse value) {
        return new JAXBElement<StartCallNotificationResponse>(_StartCallNotificationResponse_QNAME, StartCallNotificationResponse.class, null, value);
    }

}
