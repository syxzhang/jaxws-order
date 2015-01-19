
package orderSystem.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the orderSystem.client package. 
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

    private final static QName _OrderPorcessingResponse_QNAME = new QName("jaxws.orderSystem/orderprocess", "orderPorcessingResponse");
    private final static QName _OrderPorcessing_QNAME = new QName("jaxws.orderSystem/orderprocess", "orderPorcessing");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: orderSystem.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderPorcessingResponse }
     * 
     */
    public OrderPorcessingResponse createOrderPorcessingResponse() {
        return new OrderPorcessingResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link OrderPorcessing }
     * 
     */
    public OrderPorcessing createOrderPorcessing() {
        return new OrderPorcessing();
    }

    /**
     * Create an instance of {@link OrderBean }
     * 
     */
    public OrderBean createOrderBean() {
        return new OrderBean();
    }

    /**
     * Create an instance of {@link OrderItem }
     * 
     */
    public OrderItem createOrderItem() {
        return new OrderItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderPorcessingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "jaxws.orderSystem/orderprocess", name = "orderPorcessingResponse")
    public JAXBElement<OrderPorcessingResponse> createOrderPorcessingResponse(OrderPorcessingResponse value) {
        return new JAXBElement<OrderPorcessingResponse>(_OrderPorcessingResponse_QNAME, OrderPorcessingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderPorcessing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "jaxws.orderSystem/orderprocess", name = "orderPorcessing")
    public JAXBElement<OrderPorcessing> createOrderPorcessing(OrderPorcessing value) {
        return new JAXBElement<OrderPorcessing>(_OrderPorcessing_QNAME, OrderPorcessing.class, null, value);
    }

}
