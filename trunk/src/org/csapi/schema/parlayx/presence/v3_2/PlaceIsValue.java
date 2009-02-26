//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.presence.v3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceIsValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceIsValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audio" type="{http://www.csapi.org/schema/parlayx/presence/v3_2}PlaceIsAudioValue" minOccurs="0"/>
 *         &lt;element name="video" type="{http://www.csapi.org/schema/parlayx/presence/v3_2}PlaceIsVideoValue" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.csapi.org/schema/parlayx/presence/v3_2}PlaceIsTextValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceIsValue", propOrder = {
    "audio",
    "video",
    "text"
})
public class PlaceIsValue {

    protected PlaceIsAudioValue audio;
    protected PlaceIsVideoValue video;
    protected PlaceIsTextValue text;

    /**
     * Gets the value of the audio property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceIsAudioValue }
     *     
     */
    public PlaceIsAudioValue getAudio() {
        return audio;
    }

    /**
     * Sets the value of the audio property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceIsAudioValue }
     *     
     */
    public void setAudio(PlaceIsAudioValue value) {
        this.audio = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceIsVideoValue }
     *     
     */
    public PlaceIsVideoValue getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceIsVideoValue }
     *     
     */
    public void setVideo(PlaceIsVideoValue value) {
        this.video = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceIsTextValue }
     *     
     */
    public PlaceIsTextValue getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceIsTextValue }
     *     
     */
    public void setText(PlaceIsTextValue value) {
        this.text = value;
    }

}
