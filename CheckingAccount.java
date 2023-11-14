
public class CheckingAccount extends BankAccount {
	protected static final double FEE = 0.15;
	
	public CheckingAccount(String name, double initalAmount) {
		super(name,initalAmount);
		String newAccountNumber = getAccountNumber() + "-10";
		setAccountNumber(newAccountNumber);
		
	}
	
	@Override
	public boolean withdraw(double amount) {
		double totalAmount = amount + FEE;
		boolean completed = super.withdraw(totalAmount);
		
		return completed;

	}
	
	
	
}
