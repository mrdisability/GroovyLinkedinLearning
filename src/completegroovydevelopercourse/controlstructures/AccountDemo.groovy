package completegroovydevelopercourse.controlstructures

class AccountDemo {
    static void main(String[] args) {
        Account checking = new Account()
        checking.deposit(10)
        println checking.balance

        try {
            checking.deposit(-1)
        } catch (Exception e) {
            println e.message
        }

        println checking.balance

        checking.deposit([1, 5, 10])
        println checking.balance
    }
}
