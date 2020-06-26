package beanlifecycle.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareImpl implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

	private ApplicationContext applicationContext;
	
	ApplicationContextAwareImpl() {
		System.out.println("No Args invoked");
	}
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		System.out.println("from setBeanFactory is Singleton : " + applicationContext.isSingleton("Employee"));
		// this.applicationContext = applicationContext;
		
		
	}
	

	public void setBeanName(String name) {
		System.out.println("from beanName : " + name);
		
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("from setBeanFactory is Prototype : " + beanFactory.isPrototype("Employee"));
		
	}
	
//public void displayEmployeeDetails() {
//
//Employee employee = applicationContext.getBean("employee", Employee.class);
//System.out.println("Get employee details from ApplicationContext = " + employee);
//
//}
}
