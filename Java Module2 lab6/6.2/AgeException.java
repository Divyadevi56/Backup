package bankAccount;

public class AgeException extends Exception{

	
	public AgeException() {
		// TODO Auto-generated constructor stub
		System.out.println(Account.ANSI_RED+"Age of Person should be minimum 15 years to have an Account."+Account.ANSI_RESET);
	}
	
		
	
}
