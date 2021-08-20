import java.util.Scanner;

public class SavingAccount implements BankAccount{
	
	int sBal = 30000;
	String SAname = "Karthik";
	String SApassword = "hkpass@123";

	public void validateUser() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Savings Account username : ");
		String SAuser1 = sc.nextLine();
		System.out.print("Enter the Savings Account password : ");
		String SApass1 = sc.nextLine();
		if(SAname.contains(SAuser1) && SApassword.contains(SApass1)){
			System.out.println("User Authenticated");
		}
		else {
			System.out.println("User Authentication Failed");
		}
	}
	
	public void checkBankBalance() {
		System.out.println("Savings Account Available Balance : " + sBal);
	}

}