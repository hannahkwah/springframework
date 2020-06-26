package beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Whenever we create the spring container object,
//following steps we follow:
//	1. Spring bean object is created.
//	2. Dependency is established.
//	3. Check whether afterPropertiesSet() is available or not.
//	If it is available, then execute.
//	4. At the time of removal of object, check if destroy method is available.
//	If it is available, then execute.

public class BeanLifeCycleApp {

	public static void main(String[] args) {

		AbstractApplicationContext container = new ClassPathXmlApplicationContext("beans7.xml");
		
		Address refAddress = container.getBean("address", Address.class);
		
		System.out.println(refAddress.getCity() + " " + refAddress.getStreet());
		
		// manually we can remove spring bean objects by calling registerShutdownHook() method
		container.registerShutdownHook(); // to call destroy method

	}

}
