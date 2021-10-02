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

import com.example.bookstoreproject.models.Publisher;
import com.example.bookstoreproject.services.PublisherServices;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PublisherController {
	
	@Autowired
	private PublisherServices publisherServices;
	
	@PostMapping(path = "/publisher")
	public Publisher createPublisher(@RequestBody Publisher publisher) {
		return this.publisherServices.createPublisher(publisher);
	}

	@GetMapping(path = "/publisher")
	public List<Publisher> getPublishers() {
		return this.publisherServices.getPublishers();
	}

	@GetMapping(path = "publisher/{id}")
	public Optional<Publisher> getPublisher(@PathVariable String id) {
		return this.publisherServices.getPublisher(id);
	}

	@PutMapping(path = "publisher/{id}")
	public Publisher updatePublisher(@PathVariable String id, @RequestBody Publisher publisher) {
		return this.publisherServices.updatePublisher(id, publisher);
	}
	
	@DeleteMapping(path = "publisher/{id}")
	public void deletePublisher(@PathVariable String id) {
		this.publisherServices.deletePublisher(id);
	}
}
