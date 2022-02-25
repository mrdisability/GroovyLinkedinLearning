package completegroovydevelopercourse

import groovy.transform.ToString

@ToString
class Account {
    BigDecimal balance
    String type

    public Account(String type) {
        this.balance = 0
        this.type = type
    }

    void deposit(BigDecimal amount) {
        balance += amount
    }

    void withdraw(BigDecimal amount) {
        balance -= amount
    }

    // Operator overloading
    // To make below work
    // BigDecimal total = checking + savings
    BigDecimal plus(Account account) {
        // Adds account and its balance
        this.balance + account.balance
    }
}
