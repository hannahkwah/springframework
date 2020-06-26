package value;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");
		
		MyCompany refMyCompany = (MyCompany) context.getBean("optimum");
		
		refMyCompany.displayEmp();

	}

}
