package com.example.bookstoreproject.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstoreproject.models.Author;
import com.example.bookstoreproject.models.Book;
import com.example.bookstoreproject.models.Publisher;
import com.example.bookstoreproject.repositories.AuthorRepository;
import com.example.bookstoreproject.repositories.BookRepository;
import com.example.bookstoreproject.repositories.PublisherRepository;

@Service
public class BookServices {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private PublisherRepository publisherRepository;

	public Book createBook(Book book) {
		book.setId(UUID.randomUUID().toString());
		Author author = this.authorRepository.findById(book.getAuthor().getId()).get();
		Publisher publisher = this.publisherRepository.findById(book.getPublisher().getId()).get();
		book.setAuthor(author);
		book.setPublisher(publisher);
		return this.bookRepository.save(book);
	}

	public List<Book> getBooks() {
		return this.bookRepository.findAll();
	}

	public Optional<Book> getBook(String id) {
		return this.bookRepository.findById(id);
	}

	public Book updateBook(String id, Book book) {
		book.setId(id);
		Author author = this.authorRepository.findById(book.getAuthor().getId()).get();
		Publisher publisher = this.publisherRepository.findById(book.getPublisher().getId()).get();
		book.setAuthor(author);
		book.setPublisher(publisher);
		return this.bookRepository.save(book);
	}

	public void deleteBook(String id) {
		this.bookRepository.deleteById(id);
	}
}
