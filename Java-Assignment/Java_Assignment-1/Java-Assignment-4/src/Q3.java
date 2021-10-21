
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acct = new Account();
		System.out.println("Current balance : " + acct.balance());
		System.out.println("Withdrawing $200");
		acct.withdraw(200);
		System.out.println("Withdrawing negative amount");
		acct.withdraw(-1);
		System.out.println("Current balance : " + acct.balance());
		acct.withdraw(3500);

	}

}
