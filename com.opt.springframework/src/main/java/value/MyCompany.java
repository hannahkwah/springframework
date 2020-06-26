package value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("optimum")
public class MyCompany {

	private List<Employee> empList;
	private Map<String, Integer> empIDMap;
	
	@Value("#{optimum.empList[0]}")
	private Employee empName;
	
	@Value("#{optimum.empIDMap['Ain']}")
	private int empID;
	
	public MyCompany() {
		
		//ArrayList
		empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Ain"));
		empList.add(new Employee(201, "Sera"));
		empList.add(new Employee(301, "KK"));
		empList.add(new Employee(401, "Ben"));
		
		//Map
		empIDMap = new HashMap<String, Integer>();
		empIDMap.put("Ain", 101);
		empIDMap.put("Sera", 201);
		empIDMap.put("KK", 301);
		empIDMap.put("Ben", 401);
		
	} // end of MyCompany
	
	// toString method
	public void displayEmp() {
		System.out.println("Emp Name: " + empName);
		System.out.println("Emp ID: " + empID);
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public Map<String, Integer> getEmpIDMap() {
		return empIDMap;
	}

	public void setEmpIDMap(Map<String, Integer> empIDMap) {
		this.empIDMap = empIDMap;
	}

	public Employee getEmpName() {
		return empName;
	}

	public void setEmpName(Employee empName) {
		this.empName = empName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	
	
}
