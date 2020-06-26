package bank;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext refApplicationContext = new AnnotationConfigApplicationContext(BankController.class); //not calling xml
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Name : ");
		
		String choice = sc.next();
		
		Bank refBank = (Bank) refApplicationContext.getBean(choice);
		refBank.getBankDetails();
		
	}

}
