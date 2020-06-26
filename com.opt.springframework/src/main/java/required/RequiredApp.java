package required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
		
		Employee refEmployee = (Employee) context.getBean("employee");
		
		System.out.println(refEmployee.getEmployeeName() + " " + refEmployee.getMobile());
		

	}

}
