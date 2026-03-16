package OOps_Concept.Encapsulation;

public final class Money {
    private final double amount;
    
    private Money(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Money cannot be negative.");
        }
        this.amount = amount;
    }

    public static Money of(double amount) {
        return new Money(amount);
    }

    public double getAmount() {
        return amount;
    }

    public Money add(Money other) {
        return new Money(this.amount + other.amount);
    }

    public Money subtract(Money other) {
        if (this.amount < other.amount) {
            throw new IllegalArgumentException("Insufficient amount.");
        }
        return new Money(this.amount - other.amount);
    }
}
