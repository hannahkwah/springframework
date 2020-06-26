package com.opt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opt.dao.BookDAO;
import com.opt.model.Book;

@Service("")
public class BookServiceImpl implements BookService {
	
	@Autowired  // internally it's byType
	BookDAO bookDAORef;

	public void setBookDAORef(BookDAO bookDAORef) {
		this.bookDAORef = bookDAORef;
	}
	
	public Book callShowBook() {
		
		// need to call BookDAOimpl
		
		return bookDAORef.showBook();
	}

}
