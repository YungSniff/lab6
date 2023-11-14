public class SavingsAccount extends BankAccount {
    private static final double rate = 0.025;
    private static int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        savingsNumber++;
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public SavingsAccount(SavingsAccount originalAccount, double initialBalance) {
        super(originalAccount, initialBalance);
        savingsNumber++;
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double interest = getBalance() * rate;
        super.deposit(interest);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

  
}

