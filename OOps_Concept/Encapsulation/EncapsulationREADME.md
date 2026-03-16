# Program Explanation

This program models a banking system where the account object fully contorlled its internal state. 

The key goal is to ensure that no external code can corrupt the financial data or violate business rules.

The account’s internal data - such as the balance, account number, and state - is hidden using private fields. External classes cannot modify these values directly.

Instead of exposing raw data through setters, the object provides domain methods such as `deposit`, `withdraw`, `transferTo`, `freezeAccount`, and `closeAccount`. These methods represent valid operations that can occur in the banking domain.

Each method enforces strict rules that protect the integrity of the account. For example:

- withdrawals cannot exceed the available balance
- money cannot become negative
- frozen accounts cannot perform transactions
- accounts with remaining balance cannot be closed

By embedding these rules inside the object itself, the account guarantees that its invariants are always maintained.

## Core Invariants Protected

The object ensures these rules can never be violated:


```
balance >= 0
accountNumber > 0
holderName not empty
closed account cannot transact
money values cannot be negative
```

Even if other developers try to misuse the class, the object will reject invalid operations.

## Execution Flow

