package orderSystem;

import javax.jws.soap.SOAPBinding;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "orderProcess", portName = "OrderProcessPort", targetNamespace = "jaxws.orderSystem/orderprocess")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ProcessOrderImpl implements ProcessOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@WebMethod
	public OrderBean orderPorcessing(OrderBean orderBean)

	{
		System.out.println("processing order");
		
		if (orderBean.getOrderItems() != null) {
			System.out.println("Number of items is " + orderBean.getOrderItems().length);
		    orderBean.setOrderId("A12345");		
		    return orderBean;
		}
		
		return null;
	}
}
