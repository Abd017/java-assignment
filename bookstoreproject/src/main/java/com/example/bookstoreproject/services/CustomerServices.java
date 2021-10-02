package com.example.bookstoreproject.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstoreproject.models.Customer;
import com.example.bookstoreproject.repositories.CustomerRepository;

@Service
public class CustomerServices {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer createCustomer(Customer customer) {
		customer.setId(UUID.randomUUID().toString());
		this.customerRepository.save(customer);
		return customer;
	}

	public List<Customer> getCustomers() {
		return this.customerRepository.findAll();
	}

	public Optional<Customer> getCustomer(String id) {
		return this.customerRepository.findById(id);
	}

	public Customer updateCustomer(String id, Customer customer) {
		customer.setId(id);
		return this.customerRepository.save(customer);
	}

	public void deleteCustomer(String id) {
		this.customerRepository.deleteById(id);
	}

}
