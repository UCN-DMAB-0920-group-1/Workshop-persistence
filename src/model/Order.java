package model;

import java.time.LocalDate;

public abstract class Order {
	private int orderNumber;
	private LocalDate dealDate;
	private String status;
	private double price;
	private Customer customer;
	private int id;

	public Order(int orderNumber, LocalDate dealDate, String status, double price) {
		super();
		this.orderNumber = orderNumber;
		this.dealDate = dealDate;
		this.status = status;
		this.price = price;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDate getDealDate() {
		return dealDate;
	}

	public void setDealDate(LocalDate dealDate) {
		this.dealDate = dealDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
