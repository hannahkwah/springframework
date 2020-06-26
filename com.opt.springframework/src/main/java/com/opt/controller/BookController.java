package com.opt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opt.model.Book;
import com.opt.service.BookService;

@Controller("myController") // in spring boot, it will replace as @RestController
public class BookController {

	@Autowired // internally it's byType
	BookService refBookService;
	
	public Book getBookService() {
		
		return refBookService.callShowBook();
		
	}
}
