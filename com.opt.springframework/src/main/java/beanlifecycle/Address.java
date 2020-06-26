package beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean, DisposableBean{

	private String city;
	private String street;
	
	Address() {
		street = "Pasir Ris Street 21";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	// @Override
	public void destroy() throws Exception {
		System.out.println("calling destroy method");
	}
	
	// @Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("calling afterPropertiesSet method");
	}
}
