//Q4
abstract class BankAccount {
	abstract void viewAccountNumber();
}

class CheckingAccount extends BankAccount {
	public void viewAccountNumber() {
		System.out.println("Checking account number: #1932042555");
	}
}

class SavingsAccount extends BankAccount {
	public void viewAccountNumber() {
		System.out.println("Savings account number: #1932042777");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount ellieCheckingAccount = new CheckingAccount();
		ellieCheckingAccount.viewAccountNumber();

		SavingsAccount ellieSavingsAccount = new SavingsAccount();
		ellieSavingsAccount.viewAccountNumber();

	}

}
abstract class ExAbstract{
	public void m1() {}
}
