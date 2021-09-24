package com.epsilon.bookstore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/epsilon/bookstore/config.xml");
		Book book1 = (Book) context.getBean("book3");
		//System.out.println(book1);
		
		Order order1 = (Order) context.getBean("order2");
		System.out.println(order1);
	}
}
