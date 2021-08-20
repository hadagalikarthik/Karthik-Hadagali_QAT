
public class Main {

	public static void main(String[] args) {
		SavingAccount obj1 = new SavingAccount();
		CurrentAccount obj2 = new CurrentAccount();
		
		System.out.println("-----Savings Account-----");
		System.out.println("");
		obj1.validateUser();
		obj1.checkBankBalance();
		
		System.out.println("");
		
		System.out.println("-----Current Account-----");
		System.out.println("");
		obj2.validateUser();
		obj2.checkBankBalance();
		
	}

}
