package com.example.bookstoreproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstoreproject.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String>{

}
