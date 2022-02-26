package completegroovydevelopercourse.controlstructures

class Account {
    BigDecimal balance = 0.0

    def deposit(BigDecimal amount) {
        // If amount is negative through exception
        if (amount < 0) {
            throw new Exception("Amount has to be greater than 0")
        }

        balance += amount
    }

    def deposit(List amounts) {
        for (amount in amounts) {
            deposit(amount)
        }
    }
}
