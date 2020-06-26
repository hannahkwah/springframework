package qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		Bank refBank = (Bank) context.getBean("dbs"); // looks for bean id in xml file
		
		System.out.println(refBank.getRefCustomer().getCustomerType());
	}

}
