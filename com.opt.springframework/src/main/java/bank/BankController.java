package bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"bank"}) // base package name > best practice, w/o () it will still work
public class BankController {

	@Autowired
	DBSBank refDBSBank;
	
	@Autowired
	UOBBank refUOBBank;
	
	@Autowired
	SCB refSCB;

	@Bean(name ="dbs") // it calls component class
	public Bank getBank1() {
		refDBSBank.setLocation(" CBP");
		return refDBSBank;
	}
	
	@Bean(name ="uob")
	public Bank getBank2() {
		refUOBBank.setLocation(" Raffles Place");
		return refUOBBank;
	}
	
	@Bean(name ="scb")
	public Bank getBank3() {
		refSCB.setLocation(" City Hall");
		return refSCB;
	}
}
