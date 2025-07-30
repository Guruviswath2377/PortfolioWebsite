package Oops;

//Student class with encapsulation + abstraction
public class Student1 extends Person{

	private String grade;
	
	public Student1(String name, int age, String grade) {
		super(name, age);
		this.grade =  grade;
		// TODO Auto-generated constructor stub
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		if(!grade.isEmpty())
			this.grade = grade;
		else
			System.out.println("Invalid grade");
	}

	//Abstract method implementation
	@Override
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Grade: "+grade);
		
	}
	
	//Student-specfic method
	public void study() {
		System.out.println(name+ " is studying.");
	}

	@Override
	public void showRole() {
		System.out.println(name + " is a Student");
		
	}

}