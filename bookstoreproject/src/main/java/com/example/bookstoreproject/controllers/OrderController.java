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

import com.example.bookstoreproject.models.Order;
import com.example.bookstoreproject.services.OrderServices;

@RestController
public class OrderController {

	@Autowired
	private OrderServices orderServices;

	@PostMapping("/order")
	public Order createOrder(@RequestBody Order order) {
		return this.orderServices.createOrder(order);
	}

	@GetMapping(path = "/order")
	public List<Order> getOrders() {
		return this.orderServices.getOrders();
	}

	@GetMapping(path = "/order/{id}")
	public Optional<Order> getOrder(@PathVariable String id) {
		return this.orderServices.getOrder(id);
	}

	@GetMapping(path = "/order/customer/{customerId}")
	public List<Order> getCustomerOrder(@PathVariable String customerId) {
		return this.orderServices.getCustomerOrder(customerId);
	}

	@PutMapping(path = "/order/{id}")
	public Order updateOrder(@RequestBody Order order, @PathVariable String id) {
		return this.orderServices.updateOrder(id, order);
	}

	@DeleteMapping(path = "/order/{id}")
	public List<Order> deleteOrder(@PathVariable String id) {
		return this.orderServices.deleteOrder(id);
	}
}
