package com.epsilon.bookstore;

import java.util.List;

public class Order {
	int orderId;
	Customer customer;
	List<Book> orders;

	public Order() {

	}

	public Order(int orderId, Customer customer, List<Book> orders) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.orders = orders;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Book> getOrders() {
		return orders;
	}

	public void setOrders(List<Book> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", \n\tcustomer=" + customer + ", \n\torders=" + orders + "\n]";
	}

}
