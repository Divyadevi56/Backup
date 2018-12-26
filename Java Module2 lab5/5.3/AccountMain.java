package bankAccount;

public class AccountMain extends Account
{
	
	public AccountMain(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}


	void withdraw(double withdrawMoney)
	{
		if((getBalance()-withdrawMoney)>=500) {
		setBalance(getBalance() - withdrawMoney);
		System.out.println(ANSI_RED+withdrawMoney+ANSI_RESET+" INR has been successfully Withdrawn from "+ANSI_GREEN+getAccHolder().getName()+ANSI_RESET+" Account");
		System.out.println("Updated Balance of "+ANSI_GREEN+getAccHolder().getName()+ANSI_RESET+" account is "+ANSI_BLUE+getBalance()+ANSI_RESET);
		}
		else {
			System.out.println(ANSI_RED+"Money can't be withdrawn"+ANSI_RESET);
			System.out.println(ANSI_RED+"Insufficient Fund / Minimum Balance Should be Rs. 500"+ANSI_RESET);
			
		}
	}
	
	
	
	
	public static void main(String[] args)
	{
		Person person = new Person("Smith", 21);
		AccountMain account = new AccountMain(2450, person);
		System.out.println("Available Balance in the account of "+ANSI_GREEN+getAccHolder().getName()+ANSI_RESET+" account is :"+ANSI_BLUE+account.getBalance()+ANSI_RESET);
		//System.out.println();
		account.withdraw(2000);
		System.out.println(account);
		
		System.out.println("----------------------------------------------------------\n");
		Person person1 = new Person("kathy", 21);
		AccountMain account1 = new AccountMain(500000, person1);
		System.out.println("Available Balance in the account of "+ANSI_GREEN+getAccHolder().getName()+ANSI_RESET+" account is :"+ANSI_BLUE+account1.getBalance()+ANSI_RESET);
		account1.withdraw(50001);
		System.out.println(account1);
		
		
	}
}
