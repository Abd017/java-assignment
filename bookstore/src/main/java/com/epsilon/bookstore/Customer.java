package com.epsilon.bookstore;

public class Customer {
	int customerId;
	String customerName;

	public Customer() {

	}

	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [id=" + customerId + ", name=" + customerName + "]";
	}

}
