package qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bank {
	
	@Autowired
	@Qualifier("investment")
	Customer refCustomer;
	
	public void setRefCustomer(Customer refCustomer) {
		this.refCustomer = refCustomer;
	}
	
	public Customer getRefCustomer() {
		return refCustomer;
	}
}
