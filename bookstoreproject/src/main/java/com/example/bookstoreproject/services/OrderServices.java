package com.example.bookstoreproject.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstoreproject.models.Book;
import com.example.bookstoreproject.models.Customer;
import com.example.bookstoreproject.models.Order;
import com.example.bookstoreproject.repositories.BookRepository;
import com.example.bookstoreproject.repositories.CustomerRepository;
import com.example.bookstoreproject.repositories.OrderRepository;

@Service
public class OrderServices {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private BookRepository bookRepository;

	public Order createOrder(Order order) {
		order.setId(UUID.randomUUID().toString());
		Customer customer = this.customerRepository.findById(order.getCustomer().getId()).get();
		order.setCustomer(customer);
		Book book = this.bookRepository.findById(order.getBook().getId()).get();
		order.setBook(book);
		return this.orderRepository.save(order);
	}

	public List<Order> getOrders() {
		return this.orderRepository.findAll();
	}

	public Optional<Order> getOrder(String id) {
		return this.orderRepository.findById(id);
	}

	public List<Order> getCustomerOrder(String customerId) {
		return this.orderRepository.findByCustomer_Id(customerId);
	}

	public Order updateOrder(String id, Order order) {
		order.setId(id);
		Customer customer = this.customerRepository.findById(order.getCustomer().getId()).get();
		order.setCustomer(customer);
		Book book = this.bookRepository.findById(order.getBook().getId()).get();
		order.setBook(book);
		return this.orderRepository.save(order);
	}

	public List<Order> deleteOrder(String id) {
		this.orderRepository.deleteById(id);
		return this.orderRepository.findAll();
	}

}
