package bankAccount;

public class AccountMain 
{
	public static void main(String[] args)
	{
		
		
		Person person = new Person("Smith", 21);
		Account account = new Account(2000, person);
		System.out.println("Available Balance in the account of "+Account.ANSI_GREEN+person.getName()+Account.ANSI_RESET+" account is :"+Account.ANSI_BLUE+account.getBalance()+Account.ANSI_RESET);
		account.deposit(2000);
		System.out.println(account);
		
		System.out.println("----------------------------------------------------------\n");
		Person person1 = new Person("kathy", 21);
		Account account1 = new Account(3000, person1);
		System.out.println("Available Balance in the account of "+Account.ANSI_GREEN+person1.getName()+Account.ANSI_RESET+" account is :"+Account.ANSI_BLUE+account1.getBalance()+Account.ANSI_RESET);
		account1.withdraw(2000);
		System.out.println(account1);
		
	}
}
