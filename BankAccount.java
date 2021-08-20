/*
 * 1. Create an interface BankAccount, which is is having two abstract methods 
 * checkBankBalance and validateUser.  This class is being implemented by 
 * two classes SavingsAccount and CurrentAccount.
 * Write a Main class where you create objects of child classes and call its methods.
 */
interface BankAccount {
	void checkBankBalance();
	void validateUser();

}
