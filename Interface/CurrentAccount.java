import java.util.Scanner;

public class CurrentAccount implements BankAccount{

	int cBal = 90000;
	String CAname = "Alchemy";
	String CApassword = "solutions@987";

	public void validateUser() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Current Account username : ");
		String CAuser1 = sc.nextLine();
		System.out.print("Enter the Current Account password : ");
		String CApass1 = sc.nextLine();
		if(CAname.contains(CAuser1) && CApassword.contains(CApass1)) {
			System.out.println("User Authenticated");
		}
		else {
			System.out.println("User Authentication Failed");
		}
	}

	public void checkBankBalance() {
		System.out.println("Current Account Available Balance : " + cBal);
	}


}
