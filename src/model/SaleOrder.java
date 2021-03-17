package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SaleOrder extends Order {
	private String deliveryStatus;
	private LocalDate deliveryDate;
	private List<OrderLine> orderLines;
	
	public SaleOrder(int orderNumber, LocalDate dealDate, String status, double price, String deliveryStatus,
		 LocalDate deliveryDate, List<OrderLine> orderLines) {
		super(orderNumber, dealDate, status, price);
		this.deliveryStatus = deliveryStatus;
		this.deliveryDate = deliveryDate;
		this.orderLines = orderLines;
	}
	
	public SaleOrder(int orderNumber, LocalDate dealDate, String status, double price, String deliveryStatus,
			 LocalDate deliveryDate) {
		this(orderNumber, deliveryDate, deliveryStatus, price, deliveryStatus, deliveryDate, new ArrayList<>());
		
	}
	
	public SaleOrder(int orderNumber, LocalDate dealDate, String status, String deliveryStatus,
			 LocalDate deliveryDate) {
		this(orderNumber, deliveryDate, deliveryStatus, 0, deliveryStatus, deliveryDate, new ArrayList<>());
		
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	

}
