package required;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	
	private String employeeName;
	private Long mobile;
	
	@Required
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	@Required
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public Long getMobile() {
		return mobile;
	}

}
