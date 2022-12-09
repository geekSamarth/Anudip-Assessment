public class OddNumbers {

	public static void main(String[] args) {
		int n=20;
		// pass the number and call the method
		OddNum(n);

	}
	// Static method for printing Odd Numbers
	public static void OddNum(int n) {
		
		for(int i=1; i<=n;i++) {
			
			//Logic for odd number, Checking if the number is odd or Not
			
				System.out.print(i+",");
			
		}
	}

}