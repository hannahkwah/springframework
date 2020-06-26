package com.spring.example1;

public class Address {
	
	private String address;

	public String getAddress() {
		return address;
	}

	/*
	 * public void setAddress(String address) { this.address = address; }	// setter injection
	 */
	
	Address(String address) {	// constructor injection
		this.address = address;
	}
	
}
