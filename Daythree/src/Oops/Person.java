package Oops;

public abstract class Person implements SchoolMember{
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Abstract method - method declaration
	public abstract void displayDetails();
	
	//Normal or regular method
	public void greet() {
		//System.out.println("Hello! This is a student information system.");
		System.out.println("Welcome to the School Information System.");
	}
}