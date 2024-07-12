package com.model;

import java.sql.Date;

public class Order {
	
	private int orderId;
	private int orderNumber;
	private int artId;
	private int customerId;
	private String orderDate;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getArtId() {
		return artId;
	}
	public void setArtId(int artId) {
		this.artId = artId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String date) {
		this.orderDate = date;
	}
	public Order(int orderId, int orderNumber, int artId, int customerId, String orderDate) {
		super();
		this.orderId = orderId;
		this.orderNumber = orderNumber;
		this.artId = artId;
		this.customerId = customerId;
		this.orderDate = orderDate;
	}
	public Order() {
		super();
	}
	

}
