package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");
		
		Library refLibrary = (Library) context.getBean("library");
		
		System.out.println(refLibrary); // will call toString()
	}

}
