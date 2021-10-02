package com.example.bookstoreproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstoreproject.models.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, String> {

}
