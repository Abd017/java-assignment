package com.example.bookstoreproject.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstoreproject.models.Customer;
import com.example.bookstoreproject.services.CustomerServices;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServices customerServices;
	
	@PostMapping(path = "/customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		return this.customerServices.createCustomer(customer);
	}

	@GetMapping(path = "/customer")
	public List<Customer> getCustomers() {
		return this.customerServices.getCustomers();
	}

	@GetMapping(path = "customer/{id}")
	public Optional<Customer> getCustomer(@PathVariable String id) {
		return this.customerServices.getCustomer(id);
	}

	@PutMapping(path = "customer/{id}")
	public Customer updateCustomer(@PathVariable String id, @RequestBody Customer customer) {
		return this.customerServices.updateCustomer(id, customer);
	}
	
	@DeleteMapping(path = "customer/{id}")
	public void deleteCustomer(@PathVariable String id) {
		this.customerServices.deleteCustomer(id);
	}
}
