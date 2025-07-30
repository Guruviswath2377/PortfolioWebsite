package Relationship;

public class Employee1 extends Person {
	private String employeeId;
	private String designation;
	private Address address;
	public Employee1(String name,int age,String employeeId, String designation, Address address) {
		this.name=name;
		this.age=age;
		this.employeeId = employeeId;
		this.designation = designation;
		this.address = address;
	}
	public void displatEmployeeDetails() {
		diplayInfo();
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Designation:"+designation);
		System.out.println("Address Info:");
		address.displayAddress();
		
	}

}
