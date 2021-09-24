package com.epsilon.bookstore;

public class Book {
	int bookId;
	String bookName;
	Author author;
	Publisher publisher;
	double price;

	public Book() {

	}

	public Book(int bookId, String bookName, Author author, Publisher publisher, double price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ",\n\tbookName=" + bookName + ",\n\tauthor=" + author
				+ ", \n\tpublisher=" + publisher + ", \n\tprice=" + price + "\n\t]";
	}

}
