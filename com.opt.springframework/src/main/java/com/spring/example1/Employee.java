package com.spring.example1;

public class Employee {
	
	String employeeName;
	Address refAddress;
	int number;

	Employee(String employeeName, Address refAddress, int number) {
		this.employeeName = employeeName;
		this.refAddress = refAddress;
		this.number = number;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	/*
	 * public void setEmployeeName(String employeeName) { // setter injection
	 * this.employeeName = employeeName; }
	 */
	
	public Address getRefAddress() {
		return refAddress;
	}
	
	/*
	 * public void setRefAddress(Address refAddress) { // setter injection
	 * this.refAddress = refAddress; }
	 */

	public int getNumber() {
		return number;
	}

	/*
	 * public void setNumber(int number) { this.number = number; }
	 */

}
