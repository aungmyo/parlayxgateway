//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.audio_call.v3_2;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.csapi.schema.parlayx.audio_call.v3_2 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.csapi.schema.parlayx.audio_call.v3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecConfig }
     * 
     */
    public RecConfig createRecConfig() {
        return new RecConfig();
    }

    /**
     * Create an instance of {@link DigitConfig }
     * 
     */
    public DigitConfig createDigitConfig() {
        return new DigitConfig();
    }

    /**
     * Create an instance of {@link MediaMessageStatus }
     * 
     */
    public MediaMessageStatus createMediaMessageStatus() {
        return new MediaMessageStatus();
    }

    /**
     * Create an instance of {@link PlayConfig }
     * 
     */
    public PlayConfig createPlayConfig() {
        return new PlayConfig();
    }

    /**
     * Create an instance of {@link MediaParticipantInfo }
     * 
     */
    public MediaParticipantInfo createMediaParticipantInfo() {
        return new MediaParticipantInfo();
    }

}
