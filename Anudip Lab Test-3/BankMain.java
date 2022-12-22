public class BankMain {

	public static void main(String[] args) {
		// creating the instance for class bank A
		BankA a = new BankA();
		// creating the instance for class bank B
		BankB b = new BankB(); 
		// creating the instance for class bank C
		BankC c = new BankC();
		//Printing out the balance from different classes
		System.out.println("Bank Balance of Bank A Rs." +a.getBalance(1000));

		System.out.println("Bank Balance of Bank B Rs." +b.getBalance(1500));

		System.out.println("Bank Balance of Bank C Rs." +c.getBalance(2000));

	}

}