package Oops;

public class Teacher extends Person{
	
	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayDetails() {
		System.out.println("Teacher Details: ");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Subject: "+subject);
		
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if(!subject.isEmpty())
			this.subject = subject;
		else {
			System.out.println("Invalid data. Subject cannot be empty");
		}
	}

	@Override
	public void showRole() {
		System.out.println(name + " is a Teacher.");
		
	}
	

}