package com.spring.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// IoC (Inversion of Control)
// Dependency Injection (DI)
// Bean Factory and ApplicationContext
// Spring Container

// Bank has employee > address
// ref
// autowire (setter injection & constructor injection)
// annotations

public class BankApp {
	
	// Bean Factory or ApplicationContext
	
	static ApplicationContext contextRef = null;
	
	// ApplicationContext is an interface
	public static ApplicationContext getContext() { // Factory Design Pattern
		return new ClassPathXmlApplicationContext("beans.xml"); // FileSystemXmlApplicationContext or WebXmlApplicationContext
	} // end of getContext
	
	public static void main(String[] args) {
		
		contextRef = getContext(); // call line 12
		
		Bank bankRef = (Bank) contextRef.getBean("John"); // Down casting
		
		System.out.println(bankRef.getBankCode());
		System.out.println(bankRef.getEmployee().getEmployeeName());
		System.out.println(bankRef.getEmployee().getRefAddress().getAddress());
		

	}

}
