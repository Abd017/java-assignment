package com.example.bookstoreproject.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstoreproject.models.Publisher;
import com.example.bookstoreproject.repositories.PublisherRepository;

@Service
public class PublisherServices {
	
	@Autowired
	private PublisherRepository publisherRepository;

	public Publisher createPublisher(Publisher publisher) {
		publisher.setId(UUID.randomUUID().toString());
		return this.publisherRepository.save(publisher);
	}

	public List<Publisher> getPublishers() {
		return this.publisherRepository.findAll();
	}

	public Optional<Publisher> getPublisher(String id) {
		return this.publisherRepository.findById(id);
	}

	public Publisher updatePublisher(String id, Publisher publisher) {
		publisher.setId(id);
		return this.publisherRepository.save(publisher);
	}

	public void deletePublisher(String id) {
		this.publisherRepository.deleteById(id);
	}
	
	
	
}
