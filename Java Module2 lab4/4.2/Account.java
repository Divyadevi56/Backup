package bankAccount;


public class Account
{
	
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	
	private static long accNum=0;
	private double balance;
	private Person accHolder;
	
	public long getAccNum() 
	{
		return accNum;
	}
	public void setAccNum(long accNum)
	{
		Account.accNum = accNum;
	}
	public Person getAccHolder()
	{
		return accHolder;
	}
	public void setAccHolder(Person accHolder) 
	{
		this.accHolder = accHolder;
	}
	
	public void setBalance(double balance) 
	{
		//this.balance = balance;
		if(balance>=500)
			this.balance=balance;
		else
			System.out.println(ANSI_RED+"Minimum balance must be 500"+ANSI_RESET);
	}
	public void deposit(double depositMoney)
	{
		balance += depositMoney;
		System.out.println(ANSI_PURPLE+depositMoney+ANSI_RESET+" INR has been successfully Deposited to "+ANSI_GREEN+accHolder.getName()+ANSI_RESET+" Account");
		System.out.println("Updated Balance of "+ANSI_GREEN+accHolder.getName()+ANSI_RESET+" account is "+ANSI_BLUE+balance+ANSI_RESET);
	}
	public void withdraw(double withdrawMoney)
	{
		if(balance-withdrawMoney>=500) {
		balance -= withdrawMoney;
		System.out.println(ANSI_RED+withdrawMoney+ANSI_RESET+" INR has been successfully Withdrawn from "+ANSI_GREEN+accHolder.getName()+ANSI_RESET+" Account");
		System.out.println("Updated Balance of "+ANSI_GREEN+accHolder.getName()+ANSI_RESET+" account is "+ANSI_BLUE+balance+ANSI_RESET);
		}
		else {

			System.out.println(ANSI_RED+"Money can't be withdrawn"+ANSI_RESET);
			System.out.println(ANSI_RED+"Insufficient Fund / Minimum Balance Should be Rs. 500"+ANSI_RESET);
		}
	}
	public double getBalance()
	{
		//System.out.println("Available Balance in the account of "+accHolder.getName()+" account is :");
		return balance;
	}
	public Account(double balance,Person accHolder)
	{
		super();
		Account.accNum++;
		setBalance(balance);
		this.accHolder=accHolder;
	}
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accHolder=" + accHolder.getName() + ", balance=" + balance + "]";
	}
	
}
