package completegroovydevelopercourse

class AccountDemo {
    static void main(String[] args) {
        Account checking = new Account("Checking")
        checking.deposit(50.00)

        Account savings = new Account("Savings")
        savings.deposit(100.00)

        BigDecimal total = checking + savings
        println total
    }
}
