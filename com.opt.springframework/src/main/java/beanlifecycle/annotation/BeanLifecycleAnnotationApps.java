package beanlifecycle.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleAnnotationApps {

	public static void main(String[] args) {

//		ApplicationContext container = new ClassPathXmlApplicationContext("beans8.xml");
		
		// different design patterns
//		ConfigurableApplicationContext container = new ClassPathXmlApplicationContext("beans8.xml");
		AbstractApplicationContext container = new ClassPathXmlApplicationContext("beans8.xml");
		
		Customer refCustomer = (Customer) container.getBean("customer");
		
		refCustomer.doAction();
		
		container.registerShutdownHook();

	}

}
