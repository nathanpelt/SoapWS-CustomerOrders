
package org.example.buymart;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateOrdersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrdersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrdersResponse", propOrder = {
    "orderResult"
})
public class UpdateOrdersResponse {

    @XmlElement(name = "OrderResult")
    protected boolean orderResult;

    /**
     * Gets the value of the orderResult property.
     * 
     */
    public boolean isOrderResult() {
        return orderResult;
    }

    /**
     * Sets the value of the orderResult property.
     * 
     */
    public void setOrderResult(boolean value) {
        this.orderResult = value;
    }

}
