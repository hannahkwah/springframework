package com.spring.example1;

// Bean or Model or POJO

public class Bank {

	private String bankCode;
	private Employee employee; // bank has employee

	// later on will use annotations for setter & getters

	/*
	 * Bank (String bankCode, Employee employee) { this.bankCode = bankCode;
	 * this.employee = employee; }
	 */

	public String getBankCode() {
		return bankCode;
	}

	
	  public void setBankCode(String bankCode) { // setter injection 
		  this.bankCode = bankCode; }
	 

	public Employee getEmployee() {
		return employee;
	}

	
	  public void setEmployee(Employee employee) { // setter injection
	  this.employee = employee; }
	 

}
