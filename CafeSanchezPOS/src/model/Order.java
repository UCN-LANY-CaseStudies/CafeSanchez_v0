package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private String customerName;
	private Date date;
	private String status;
	private List<Orderline> orderlines;

	public static final String STATUS_NEW = "New";
	public static final String STATUS_ACTIVE = "Active";
	public static final String STATUS_FINISHED = "Finished";
	public static final String STATUS_READY = "Ready";

	public String getCustomerName() {
		return customerName;
	}

	public Date getDate() {
		return date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Orderline> getOrderlines() {
		return orderlines;
	}

	public Order(String customerName) {
		super();
		this.customerName = customerName;
		this.date = new Date();
		this.status = STATUS_NEW;
		this.orderlines = new ArrayList<Orderline>();
	}
	
	public float getTotalPrice() {
		float result = 0;
		for(Orderline ol : orderlines) {
			result += ol.getSubTotal();
		}
		return result;
	}

	@Override
	public String toString() {
		int qty = 0;
		for (Orderline ol : orderlines) {
			qty += ol.getQuantity();
		}
		return customerName + ": " + qty + " cups - " + status;
	}
}
