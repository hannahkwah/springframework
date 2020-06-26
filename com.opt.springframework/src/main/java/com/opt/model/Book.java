package com.opt.model;

import org.springframework.stereotype.Component;

// this class will become our entity class for Spring Data JPA

@Component("")
public class Book {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
