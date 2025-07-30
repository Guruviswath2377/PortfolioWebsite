package Oops;

public class Main {

	public static void main(String[] args) {
		//Person reference for abstraction
		
//		Person stud = new Student1("Rahul",16,"10th");
//		Person teacher = new Teacher("Ms. Anita", 35, "Mathematics");
//		Person admin = new Admin("Mr. Sharma", 40, "Principal");
//		
//		//Calling the abstract class normal method
//		stud.greet();
//		
//		//Call abstract method implemented in subclass Student1
//		stud.displayDetails();
//		
//		//stud.setGrade("11th");
////		if(stud instanceof Student1) {
////			Student1 stu = (Student1) stud;
////			stu.setGrade("11th");
////			System.out.println("\nAfter Updating grade:");
////			stu.displayDetails();
////		}
//		
//		System.out.println();
//		teacher.displayDetails();
//		
//		System.out.println();
//		admin.displayDetails();
		
		
		//Polymorphism: Using interface reference for all types
		SchoolMember[] member = new SchoolMember[3];
		member[0] = new Student1("Ravi",17,"12th");
		member[1] = new Teacher("Ms. Anita", 35, "Mathematics");
		member[2] = new Admin("Mr. Sharma", 40, "Principal");
		
		//Loop through all members and call method polymorphically
		for(SchoolMember memb: member) {
			memb.showRole();
			
			//Downcast to Person to call displayDetails
			if(memb instanceof Person) {
				//((Person) memb).displayDetails(); 
				((Person) memb).displayDetails();
				//Confirmation of object is a Person, cast the memb to Person
			}
		}
			
	}

}