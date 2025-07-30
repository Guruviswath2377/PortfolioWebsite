package Oops;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stud = new Student(101,"Rahul",18,97);
		//Student stud = new Student("Rahul",101,18,97);
		
		stud.displayInfo();
		
		System.out.println("\n-----Updating Student details-------");
		//Student stud = new Student(101,"Rahul",18,97);
		stud.setAge(22);
		stud.setMark1(76);
		
		stud.displayInfo();

		System.out.println("\nValidation of age");
		stud.setAge(4);
		
		//stud.displayInfo();
	}

}