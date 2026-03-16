package OOps_Concept.Encapsulation;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = BankAccount.openAccount(101, "Kailash", 10000);
        BankAccount acc2 = BankAccount.openAccount(102, "Rahul", 5000);
        SavingsAccount savAcc3 = BankAccount.openSavingsAccount(103, "Rakesh", 12000, 0.05);

        acc1.deposit(3000);
        acc2.withdraw(1500);
        savAcc3.withdraw(1000);

        // this line will throw the Illegal Argument Exception "Cannot transfer to same account"
        // acc1.transferTo(acc1, 1500);
        acc1.transferTo(acc2, 1500);
        savAcc3.transferTo(acc1, 1000);

        savAcc3.applyMonthlyInterest();
        System.out.println("Savings Account Interest Rate: " + savAcc3.getInterestRate());

        System.out.println("Accunt1 Balance: " + acc1.getBalance());
        System.out.println("Account2 Balance: " + acc2.getBalance());
        System.out.println("Savings Account3 Balance: " + savAcc3.getBalance());
    }
}
