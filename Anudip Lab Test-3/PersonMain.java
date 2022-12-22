public class PersonMain {
	public static void main(String[] args) {
		// subject array to be taken
		String []subject = new String[3];
		subject[0]="CPP";
		subject[1]="C";
		subject[2]="Java Script";
		// instance of student class
		Student s1 = new Student("Samarth",22,"9843526212",101,subject);
		Student s2 = new Student("Ankit",21,"9811241611",004,subject);
		// printing out the student details in the console
		System.out.println(s1);
		// printing out the student details in the console
		System.out.println(s2);
		
	}
}
