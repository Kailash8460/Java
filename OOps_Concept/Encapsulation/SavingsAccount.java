package OOps_Concept.Encapsulation;

public class SavingsAccount extends BankAccount{

    private final double interestRate;

    protected SavingsAccount(int accountNumber, String holderName, Money initialDeposit, double interestRate) {
        
        super(accountNumber, holderName, initialDeposit);

        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }

        this.interestRate = interestRate;
    }

    public void applyMonthlyInterest() {

        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    public double getInterestRate() {
        return interestRate;
    }
    
}
