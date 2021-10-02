package com.example.bookstoreproject.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstoreproject.models.Author;
import com.example.bookstoreproject.repositories.AuthorRepository;

@Service
public class AuthorServices {
	
	@Autowired
	private AuthorRepository authorRepository;

	public Author createAuthor(Author author) {
		author.setId(UUID.randomUUID().toString());
		this.authorRepository.save(author);
		return author;
	}

	public List<Author> getAuthors() {
		return this.authorRepository.findAll();
	}

	public Optional<Author> getAuthor(String id) {
		return this.authorRepository.findById(id);
	}

	public Author updateAuthor(String id, Author author) {
		author.setId(id);
		return this.authorRepository.save(author);
	}

	public void deleteAuthor(String id) {
		this.authorRepository.deleteById(id);
	}
	
	
}
