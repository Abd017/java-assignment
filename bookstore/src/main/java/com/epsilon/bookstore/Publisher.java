package com.epsilon.bookstore;

public class Publisher {
	int publisherId;
	String publisherName;
	String publisherLocation;

	public Publisher() {

	}

	public Publisher(int publisherId, String publisherName, String publisherLocation) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.publisherLocation = publisherLocation;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherLocation() {
		return publisherLocation;
	}

	public void setPublisherLocation(String publisherLocation) {
		this.publisherLocation = publisherLocation;
	}

	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", publisherName=" + publisherName + ", publisherLocation="
				+ publisherLocation + "]";
	}

}
