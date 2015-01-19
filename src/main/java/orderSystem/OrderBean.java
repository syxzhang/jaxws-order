/**
 * 
 */
package orderSystem;

/**
 * @author bm01683
 *
 */
public class OrderBean {
	private Customer custsomer;
	private Address shippingAddress;
	private OrderItem[] orderItems;
	private String orderId;

	public Customer getCustomer() {
		return custsomer;
	}

	public void setCustomer(Customer customer) {
		this.custsomer = customer;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public OrderItem[] getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItem[] orderItems) {
		this.orderItems = orderItems;
	}
}
