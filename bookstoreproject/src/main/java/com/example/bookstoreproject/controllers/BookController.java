package com.example.bookstoreproject.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstoreproject.models.Book;
import com.example.bookstoreproject.services.BookServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

	@Autowired
	private BookServices bookServices;
	
	@PostMapping(path = "/book")
	public Book createBook(@RequestBody Book book) {
		return this.bookServices.createBook(book);
	}
	
	@GetMapping(path = "/book")
	public List<Book> getBooks(){
		return this.bookServices.getBooks();
	}
	
	@GetMapping(path = "/book/{id}")
	public Optional<Book> getBook(@PathVariable String id){
		return this.bookServices.getBook(id);
	}
	
	@PutMapping(path = "/book/{id}")
	public Book updateBook(@PathVariable String id, @RequestBody Book book) {
		return this.bookServices.updateBook(id, book);
	}
	
	@DeleteMapping(path = "/book/{id}")
	public void deleteBook(@PathVariable String id) {
		this.bookServices.deleteBook(id);
	}
}
