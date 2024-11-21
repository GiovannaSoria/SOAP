
package com.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DivideResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "divideResult"
})
@XmlRootElement(name = "DivideResponse")
public class DivideResponse {

    @XmlElement(name = "DivideResult")
    protected double divideResult;

    /**
     * Obtiene el valor de la propiedad divideResult.
     * 
     */
    public double getDivideResult() {
        return divideResult;
    }

    /**
     * Define el valor de la propiedad divideResult.
     * 
     */
    public void setDivideResult(double value) {
        this.divideResult = value;
    }

}
