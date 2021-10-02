package com.example.bookstoreproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstoreproject.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String>{
	public List<Order> findByCustomer_Id(String id);
}
