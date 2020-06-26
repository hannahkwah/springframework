package com.opt.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opt.controller.BookController;

public class BookApplication {

	public static void main(String[] args) {
		
		ApplicationContext contextRef = new ClassPathXmlApplicationContext("beans2.xml");
		BookController refBookController = (BookController) contextRef.getBean("myController");
		System.out.println(refBookController.getBookService().getName());
		

	}

}
