package bankAccount;

public class AccountMain
{
	public static void main(String[] args) throws AgeException
	{
		try {
		Person person = new Person("Smith",14);
		SavingAccount account = new SavingAccount(2450, person);
		System.out.println("Available Balance in the account of "+Account.ANSI_GREEN+person.getName()+Account.ANSI_RESET+" account is :"+Account.ANSI_BLUE+account.getBalance()+Account.ANSI_RESET);
		account.withdraw(2000);
		System.out.println(account);
		//System.out.println(person.getAge());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Name is: "+e);
		}
		
		System.out.println("----------------------------------------------------------\n");
		try {
		Person person1 = new Person("kathy",25);
		CurrentAccount account1 = new CurrentAccount(500000, person1);
		System.out.println("Available Balance in the account of "+Account.ANSI_GREEN+person1.getName()+Account.ANSI_RESET+" account is :"+Account.ANSI_BLUE+account1.getBalance()+Account.ANSI_RESET);
		account1.withdraw(30001);
		System.out.println(account1);
		//System.out.println(person1.getAge());
		}
		catch (AgeException e) {
			// TODO: handle exception
			System.out.println("Exception Name is: "+e);
		}
		
	}
}
