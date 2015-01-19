
package orderSystem.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 *
 */
@WebServiceClient(name = "orderProcess", targetNamespace = "jaxws.orderSystem/orderprocess",
wsdlLocation = "file:/C:/WORK/OrderProcessExample/orderSystem/target/classes/OrderProcess.wsdl")
public class OrderProcess
    extends Service
{

    private final static URL ORDERPROCESS_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(orderSystem.client.OrderProcess.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = orderSystem.client.OrderProcess.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/WORK/OrderProcessExample/orderSystem/target/classes/OrderProcess.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/WORK/OrderProcessExample/orderSystem/target/classes/OrderProcess.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ORDERPROCESS_WSDL_LOCATION = url;
    }

    public OrderProcess(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderProcess() {
        super(ORDERPROCESS_WSDL_LOCATION, new QName("jaxws.orderSystem/orderprocess", "orderProcess"));
    }

    /**
     *
     * @return
     *     returns ProcessOrderImpl
     */
    @WebEndpoint(name = "OrderProcessPort")
    public ProcessOrderImpl getOrderProcessPort() {
        return super.getPort(new QName("jaxws.orderSystem/orderprocess", "OrderProcessPort"), ProcessOrderImpl.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProcessOrderImpl
     */
    @WebEndpoint(name = "OrderProcessPort")
    public ProcessOrderImpl getOrderProcessPort(WebServiceFeature... features) {
        return super.getPort(new QName("jaxws.orderSystem/orderprocess", "OrderProcessPort"), ProcessOrderImpl.class, features);
    }

}
