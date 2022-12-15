public class Main {
    public static void main(String[] args) {
		// instance of Employee class
		Employee emp = new Employee("Samarth",22,"9627567700","1200-B Govindpuri",45000,"CS");
		// instance of Manager class
		Manager mng = new Manager("Sam",32,"8173452134","Greater Noida",67543.54,"Finance");
		// now print the salary
		emp.Display();
		emp.printSpecialization();
		emp.printSalary();
		mng.Display();
		mng.printDepartment();
		mng.printSalary();
	}
}
