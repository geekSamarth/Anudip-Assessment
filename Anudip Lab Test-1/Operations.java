import java.util.Scanner;
public class Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// initialize numbers
		int n1,n2;
		// initialize operator
		char op;
		// Taking Input from user
		System.out.print("Enter the First Number: ");
		n1 = sc.nextInt();
		System.out.print("Enter the Second Number: ");
		n2 = sc.nextInt();
		System.out.print("Select Operator from  +,-,%,*,/ ");
		System.out.print("Enter the Operator: ");
		op = sc.next().charAt(0);
		// call the static method 
		operation(n1,n2,op);

	}
	// Static method for operations
	public static void operation(int num1,int num2, char operator) {
		// create cases for different operations 
		switch(operator){
			case '+': 
				System.out.println("Addition of Two Numbers is: "+(num1+num2));
				break;
			case '-':
				System.out.println("Subtraction of Two Numbers is: "+(num1 - num2));
				break;
			case '*':
				System.out.println("Multiplication of Two Numbers is: "+(num1 * num2));
				break;
			case '/':
				System.out.println("Division of Two Numbers is: "+(num1 / num2));
				break;
			case '%':
				System.out.println("Remainder of Two Numbers is: "+(num1 % num2));
				break;
			default:
				System.out.println("Invalid Operator...");
				break;
		}
	}

}
