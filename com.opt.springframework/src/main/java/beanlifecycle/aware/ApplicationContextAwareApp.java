package beanlifecycle.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextAwareApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ApplicationContextAwareImpl refApplicationContextAwareImpl = context.getBean("applicationContextAware", ApplicationContextAwareImpl.class);
		
		// refApplicationContextAwareImpl.displayEmployeeDetails();

	}

}
