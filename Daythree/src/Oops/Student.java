package Oops;

public class Student {
	//private data members for encapsulation
	private int rollno;     //instance variable
	private String name;
	private int age;
	private float mark1;
	
	//constructor
	public Student(int rollno, String name, int age, float mark1) {
		this.rollno=rollno;
		this.name=name;
		setAge(age);
		this.mark1 = mark1;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//this.age = age;
		if(age>5 && age<100) {
			this.age =age;
		}
		else {
			System.out.println("Invalid age. Age must be between 6 and 99");
		}
	}

	public void setMark1(float mark1) {
		this.mark1 = mark1;
	}

	public float getMark1() {
		return mark1;
	}

//	public void setMark1(float mark1) {
//		this.mark1 = mark1;
//	}
	
	//Method to display student info
	public void displayInfo() {
		System.out.println("Student Rollno: "+rollno);
		System.out.println("Student name: "+name);
		System.out.println("Student Age: "+age);
		System.out.println("Student Mark1: "+mark1);
	}

}