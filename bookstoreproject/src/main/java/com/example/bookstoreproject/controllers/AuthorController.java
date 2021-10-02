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

import com.example.bookstoreproject.models.Author;
import com.example.bookstoreproject.services.AuthorServices;

@RestController
public class AuthorController {

	@Autowired
	private AuthorServices authorServices;

	@PostMapping(path = "/author")
	public Author createAuthor(@RequestBody Author author) {
		return this.authorServices.createAuthor(author);
	}

	@GetMapping(path = "/author")
	public List<Author> getAuthors() {
		return this.authorServices.getAuthors();
	}

	@GetMapping(path = "author/{id}")
	public Optional<Author> getAuthor(@PathVariable String id) {
		return this.authorServices.getAuthor(id);
	}

	@PutMapping(path = "author/{id}")
	public Author updateAuthor(@PathVariable String id, @RequestBody Author author) {
		return this.authorServices.updateAuthor(id, author);
	}
	
	@DeleteMapping(path = "author/{id}")
	public void deleteAuthor(@PathVariable String id) {
		this.authorServices.deleteAuthor(id);
	}
}
