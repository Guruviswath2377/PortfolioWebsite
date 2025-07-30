package Oops;

public class Admin extends Person{
	
	private String role;

	public Admin(String name, int age, String role) {
		super(name, age);
		this.role = role;
		// TODO Auto-generated constructor stub
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		if(!role.isEmpty())
			this.role = role;
		else
			System.out.println("Role cannot be empty.");
	}

	@Override
	public void displayDetails() {
		System.out.println("Admin Details:");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Role: "+role);
		
	}

	@Override
	public void showRole() {
		System.out.println(name + " is an Admin");
		
	}
	
}