package Relationship;

public class Employee extends Person {
	private String employeeId;
	private String designation;
	public Employee(String name,int age, String employeeId, String designation) {
		this.name=name;
		this.age=age;
		this.employeeId = employeeId;
		this.designation = designation;
	}
public void displayEmployeeDetails() {
	diplayInfo();
	System.out.println("Employee Id:"+employeeId);
	System.out.println("Designation:"+designation);
}
}
