package bankAccount;

public class CurrentAccount extends Account
{
	final long overdraft = 50000;
	public CurrentAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		
	}
	@Override
	public void withdraw(double withdrawMoney) {
		if(overdraft-withdrawMoney>0)
		{
			super.withdraw(withdrawMoney);
		}
		else
		{
			System.out.println(ANSI_RED+"Cannot withdraw Money as you Crossed Overdraft limit"+ANSI_RESET);
		}
	}
}
