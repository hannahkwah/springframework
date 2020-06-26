package com.opt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.opt.model.Book;

@Repository("")
public class BookDAOImpl implements BookDAO {

	@Autowired  // internally it's byType
	Book bookRef;
	
	public Book showBook() {
		// not created any object of Book class
		// Spring > developer don't create any object
		// Spring container creates an object
		bookRef.setName("Spring framework");
		return bookRef;
	}

}
