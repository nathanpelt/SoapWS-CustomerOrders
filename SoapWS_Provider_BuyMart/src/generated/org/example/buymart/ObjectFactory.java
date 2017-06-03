
package org.example.buymart;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.buymart package. 
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

    private final static QName _GetOrdersRequest_QNAME = new QName("http://www.example.org/BuyMart/", "GetOrdersRequest");
    private final static QName _UpdateOrdersRequest_QNAME = new QName("http://www.example.org/BuyMart/", "UpdateOrdersRequest");
    private final static QName _CreateOrdersRequest_QNAME = new QName("http://www.example.org/BuyMart/", "CreateOrdersRequest");
    private final static QName _UpdateOrdersResponse_QNAME = new QName("http://www.example.org/BuyMart/", "UpdateOrdersResponse");
    private final static QName _DeleteOrdersRequest_QNAME = new QName("http://www.example.org/BuyMart/", "DeleteOrdersRequest");
    private final static QName _DeleteOrdersResponse_QNAME = new QName("http://www.example.org/BuyMart/", "DeleteOrdersResponse");
    private final static QName _GetOrdersResponse_QNAME = new QName("http://www.example.org/BuyMart/", "GetOrdersResponse");
    private final static QName _CreateOrdersResponse_QNAME = new QName("http://www.example.org/BuyMart/", "CreateOrdersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.buymart
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrdersRequest }
     * 
     */
    public GetOrdersRequest createGetOrdersRequest() {
        return new GetOrdersRequest();
    }

    /**
     * Create an instance of {@link UpdateOrdersRequest }
     * 
     */
    public UpdateOrdersRequest createUpdateOrdersRequest() {
        return new UpdateOrdersRequest();
    }

    /**
     * Create an instance of {@link CreateOrdersRequest }
     * 
     */
    public CreateOrdersRequest createCreateOrdersRequest() {
        return new CreateOrdersRequest();
    }

    /**
     * Create an instance of {@link UpdateOrdersResponse }
     * 
     */
    public UpdateOrdersResponse createUpdateOrdersResponse() {
        return new UpdateOrdersResponse();
    }

    /**
     * Create an instance of {@link DeleteOrdersRequest }
     * 
     */
    public DeleteOrdersRequest createDeleteOrdersRequest() {
        return new DeleteOrdersRequest();
    }

    /**
     * Create an instance of {@link DeleteOrdersResponse }
     * 
     */
    public DeleteOrdersResponse createDeleteOrdersResponse() {
        return new DeleteOrdersResponse();
    }

    /**
     * Create an instance of {@link GetOrdersResponse }
     * 
     */
    public GetOrdersResponse createGetOrdersResponse() {
        return new GetOrdersResponse();
    }

    /**
     * Create an instance of {@link CreateOrdersResponse }
     * 
     */
    public CreateOrdersResponse createCreateOrdersResponse() {
        return new CreateOrdersResponse();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/BuyMart/", name = "GetOrdersRequest")
    public JAXBElement<GetOrdersRequest> createGetOrdersRequest(GetOrdersRequest value) {
        return new JAXBElement<GetOrdersRequest>(_GetOrdersRequest_QNAME, GetOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/BuyMart/", name = "UpdateOrdersRequest")
    public JAXBElement<UpdateOrdersRequest> createUpdateOrdersRequest(UpdateOrdersRequest value) {
        return new JAXBElement<UpdateOrdersRequest>(_UpdateOrdersRequest_QNAME, UpdateOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/BuyMart/", name = "CreateOrdersRequest")
    public JAXBElement<CreateOrdersRequest> createCreateOrdersRequest(CreateOrdersRequest value) {
        return new JAXBElement<CreateOrdersRequest>(_CreateOrdersRequest_QNAME, CreateOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/BuyMart/", name = "UpdateOrdersResponse")
    public JAXBElement<UpdateOrdersResponse> createUpdateOrdersResponse(UpdateOrdersResponse value) {
        return new JAXBElement<UpdateOrdersResponse>(_UpdateOrdersResponse_QNAME, UpdateOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/BuyMart/", name = "DeleteOrdersRequest")
    public JAXBElement<DeleteOrdersRequest> createDeleteOrdersRequest(DeleteOrdersRequest value) {
        return new JAXBElement<DeleteOrdersRequest>(_DeleteOrdersRequest_QNAME, DeleteOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/BuyMart/", name = "DeleteOrdersResponse")
    public JAXBElement<DeleteOrdersResponse> createDeleteOrdersResponse(DeleteOrdersResponse value) {
        return new JAXBElement<DeleteOrdersResponse>(_DeleteOrdersResponse_QNAME, DeleteOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/BuyMart/", name = "GetOrdersResponse")
    public JAXBElement<GetOrdersResponse> createGetOrdersResponse(GetOrdersResponse value) {
        return new JAXBElement<GetOrdersResponse>(_GetOrdersResponse_QNAME, GetOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/BuyMart/", name = "CreateOrdersResponse")
    public JAXBElement<CreateOrdersResponse> createCreateOrdersResponse(CreateOrdersResponse value) {
        return new JAXBElement<CreateOrdersResponse>(_CreateOrdersResponse_QNAME, CreateOrdersResponse.class, null, value);
    }

}
