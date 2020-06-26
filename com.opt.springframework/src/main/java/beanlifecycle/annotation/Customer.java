package beanlifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer {
	
	@PostConstruct
	public void init() {
		System.out.println("Customer init method get called...");
	}
	
	public void doAction() {
		System.out.println("Customer doaction method get called...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Customer destroy method get called...");
	}

}
