//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.presence.supplier.v2_3.local;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.csapi.schema.parlayx.presence.supplier.v2_3.local package. 
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

    private final static QName _GetMyWatchers_QNAME = new QName("http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", "getMyWatchers");
    private final static QName _BlockSubscriptionResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", "blockSubscriptionResponse");
    private final static QName _GetOpenSubscriptions_QNAME = new QName("http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", "getOpenSubscriptions");
    private final static QName _Publish_QNAME = new QName("http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", "publish");
    private final static QName _BlockSubscription_QNAME = new QName("http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", "blockSubscription");
    private final static QName _GetSubscribedAttributesResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", "getSubscribedAttributesResponse");
    private final static QName _GetSubscribedAttributes_QNAME = new QName("http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", "getSubscribedAttributes");
    private final static QName _PublishResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", "publishResponse");
    private final static QName _UpdateSubscriptionAuthorizationResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", "updateSubscriptionAuthorizationResponse");
    private final static QName _UpdateSubscriptionAuthorization_QNAME = new QName("http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", "updateSubscriptionAuthorization");
    private final static QName _GetMyWatchersResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", "getMyWatchersResponse");
    private final static QName _GetOpenSubscriptionsResponse_QNAME = new QName("http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", "getOpenSubscriptionsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.csapi.schema.parlayx.presence.supplier.v2_3.local
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMyWatchersResponse }
     * 
     */
    public GetMyWatchersResponse createGetMyWatchersResponse() {
        return new GetMyWatchersResponse();
    }

    /**
     * Create an instance of {@link Publish }
     * 
     */
    public Publish createPublish() {
        return new Publish();
    }

    /**
     * Create an instance of {@link UpdateSubscriptionAuthorization }
     * 
     */
    public UpdateSubscriptionAuthorization createUpdateSubscriptionAuthorization() {
        return new UpdateSubscriptionAuthorization();
    }

    /**
     * Create an instance of {@link GetMyWatchers }
     * 
     */
    public GetMyWatchers createGetMyWatchers() {
        return new GetMyWatchers();
    }

    /**
     * Create an instance of {@link GetOpenSubscriptions }
     * 
     */
    public GetOpenSubscriptions createGetOpenSubscriptions() {
        return new GetOpenSubscriptions();
    }

    /**
     * Create an instance of {@link GetSubscribedAttributes }
     * 
     */
    public GetSubscribedAttributes createGetSubscribedAttributes() {
        return new GetSubscribedAttributes();
    }

    /**
     * Create an instance of {@link GetOpenSubscriptionsResponse }
     * 
     */
    public GetOpenSubscriptionsResponse createGetOpenSubscriptionsResponse() {
        return new GetOpenSubscriptionsResponse();
    }

    /**
     * Create an instance of {@link UpdateSubscriptionAuthorizationResponse }
     * 
     */
    public UpdateSubscriptionAuthorizationResponse createUpdateSubscriptionAuthorizationResponse() {
        return new UpdateSubscriptionAuthorizationResponse();
    }

    /**
     * Create an instance of {@link GetSubscribedAttributesResponse }
     * 
     */
    public GetSubscribedAttributesResponse createGetSubscribedAttributesResponse() {
        return new GetSubscribedAttributesResponse();
    }

    /**
     * Create an instance of {@link BlockSubscriptionResponse }
     * 
     */
    public BlockSubscriptionResponse createBlockSubscriptionResponse() {
        return new BlockSubscriptionResponse();
    }

    /**
     * Create an instance of {@link PublishResponse }
     * 
     */
    public PublishResponse createPublishResponse() {
        return new PublishResponse();
    }

    /**
     * Create an instance of {@link BlockSubscription }
     * 
     */
    public BlockSubscription createBlockSubscription() {
        return new BlockSubscription();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyWatchers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", name = "getMyWatchers")
    public JAXBElement<GetMyWatchers> createGetMyWatchers(GetMyWatchers value) {
        return new JAXBElement<GetMyWatchers>(_GetMyWatchers_QNAME, GetMyWatchers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockSubscriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", name = "blockSubscriptionResponse")
    public JAXBElement<BlockSubscriptionResponse> createBlockSubscriptionResponse(BlockSubscriptionResponse value) {
        return new JAXBElement<BlockSubscriptionResponse>(_BlockSubscriptionResponse_QNAME, BlockSubscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenSubscriptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", name = "getOpenSubscriptions")
    public JAXBElement<GetOpenSubscriptions> createGetOpenSubscriptions(GetOpenSubscriptions value) {
        return new JAXBElement<GetOpenSubscriptions>(_GetOpenSubscriptions_QNAME, GetOpenSubscriptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Publish }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", name = "publish")
    public JAXBElement<Publish> createPublish(Publish value) {
        return new JAXBElement<Publish>(_Publish_QNAME, Publish.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockSubscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", name = "blockSubscription")
    public JAXBElement<BlockSubscription> createBlockSubscription(BlockSubscription value) {
        return new JAXBElement<BlockSubscription>(_BlockSubscription_QNAME, BlockSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscribedAttributesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", name = "getSubscribedAttributesResponse")
    public JAXBElement<GetSubscribedAttributesResponse> createGetSubscribedAttributesResponse(GetSubscribedAttributesResponse value) {
        return new JAXBElement<GetSubscribedAttributesResponse>(_GetSubscribedAttributesResponse_QNAME, GetSubscribedAttributesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscribedAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", name = "getSubscribedAttributes")
    public JAXBElement<GetSubscribedAttributes> createGetSubscribedAttributes(GetSubscribedAttributes value) {
        return new JAXBElement<GetSubscribedAttributes>(_GetSubscribedAttributes_QNAME, GetSubscribedAttributes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", name = "publishResponse")
    public JAXBElement<PublishResponse> createPublishResponse(PublishResponse value) {
        return new JAXBElement<PublishResponse>(_PublishResponse_QNAME, PublishResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubscriptionAuthorizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", name = "updateSubscriptionAuthorizationResponse")
    public JAXBElement<UpdateSubscriptionAuthorizationResponse> createUpdateSubscriptionAuthorizationResponse(UpdateSubscriptionAuthorizationResponse value) {
        return new JAXBElement<UpdateSubscriptionAuthorizationResponse>(_UpdateSubscriptionAuthorizationResponse_QNAME, UpdateSubscriptionAuthorizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubscriptionAuthorization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", name = "updateSubscriptionAuthorization")
    public JAXBElement<UpdateSubscriptionAuthorization> createUpdateSubscriptionAuthorization(UpdateSubscriptionAuthorization value) {
        return new JAXBElement<UpdateSubscriptionAuthorization>(_UpdateSubscriptionAuthorization_QNAME, UpdateSubscriptionAuthorization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyWatchersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", name = "getMyWatchersResponse")
    public JAXBElement<GetMyWatchersResponse> createGetMyWatchersResponse(GetMyWatchersResponse value) {
        return new JAXBElement<GetMyWatchersResponse>(_GetMyWatchersResponse_QNAME, GetMyWatchersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenSubscriptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/parlayx/presence/supplier/v2_3/local", name = "getOpenSubscriptionsResponse")
    public JAXBElement<GetOpenSubscriptionsResponse> createGetOpenSubscriptionsResponse(GetOpenSubscriptionsResponse value) {
        return new JAXBElement<GetOpenSubscriptionsResponse>(_GetOpenSubscriptionsResponse_QNAME, GetOpenSubscriptionsResponse.class, null, value);
    }

}
