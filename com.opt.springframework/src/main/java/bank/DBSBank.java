package bank;

import org.springframework.stereotype.Component;

@Component
public class DBSBank implements Bank {
	
	private String location;
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void getBankDetails() {
		System.out.println("DBS Bank : " + location);

	}

}
