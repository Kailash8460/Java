package OOps_Concept.Encapsulation;

import java.util.*;

public class BankAccount {

    private final int accountNumber;
    private final String holderName;
    private Money balance;
    private AccountState state;
    private static Set<Integer> existingAccountNumbers = new HashSet<>();

    protected enum AccountState {
        ACTIVE,
        FROZEN,
        CLOSED
    };

    // changing from private to protected to give access to SavingsAccount class
    protected BankAccount(int accountNumber, String holderName, Money initialDeposit) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialDeposit;
        this.state = AccountState.ACTIVE;
    }

    public static BankAccount openAccount(int accountNumber, String holderName, double initialDeposit) {
        
        if (accountNumber <= 0) {
            throw new IllegalArgumentException("Invalid account number.");
        }

        if (holderName == null || holderName.isBlank()) {
            throw new IllegalArgumentException("Holder name required.");
        }

        if (existingAccountNumbers.contains(accountNumber)) {
            throw new IllegalArgumentException("Account number already exists.");
        }

        Money deposit = Money.of(initialDeposit);
        existingAccountNumbers.add(accountNumber);

        return new BankAccount(accountNumber, holderName, deposit);
    }

    public static SavingsAccount openSavingsAccount(int accountNumber, String holderName, double initialDeposit, double interestRate) {

        if (accountNumber <= 0) {
            throw new IllegalArgumentException("Invalid account number.");
        }

        if (holderName == null || holderName.isBlank()) {
            throw new IllegalArgumentException("Holder name required.");
        }

        if (existingAccountNumbers.contains(accountNumber)) {
            throw new IllegalArgumentException("Account number already exists.");
        }

        Money deposit = Money.of(initialDeposit);
        existingAccountNumbers.add(accountNumber);

        return new SavingsAccount(accountNumber, holderName, deposit, interestRate);
    }

    public synchronized void deposit(double amount) {

        ensureActiveAccount();

        Money deposit = Money.of(amount);
        balance = balance.add(deposit);
    }

    public synchronized void withdraw(double amount) {

        ensureActiveAccount();

        Money withdrawal = Money.of(amount);
        balance = balance.subtract(withdrawal);
    }

    public synchronized void transferTo(BankAccount target, double amount) {

        if (target == null) {
            throw new IllegalArgumentException("Target account required.");
        }

        if (this == target) {
            throw new IllegalArgumentException("Cannot transfer to same account.");
        }

        this.withdraw(amount);
        target.deposit(amount);
    }

    public synchronized void freezeAccount() {

        if (state == AccountState.CLOSED) {
            throw new IllegalArgumentException("Closed account cannot be frozen.");
        }

        state = AccountState.FROZEN;
    }

    public synchronized void closeAccount() {

        if (balance.getAmount() > 0) {
            throw new IllegalArgumentException("Balance must be zero before closing");
        }

        state = AccountState.CLOSED;
    }

    private void ensureActiveAccount() {
        if (state != AccountState.ACTIVE) {
            throw new IllegalArgumentException("Account is not active.");
        }
    }

    public final int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance.getAmount();
    }

    public String getState() {
        return state.name();
    }
    
}
