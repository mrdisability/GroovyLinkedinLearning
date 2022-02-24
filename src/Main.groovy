class Main {
    static void main(String[] args) {
        Calculator calculator = new Calculator()

        // Complains if assert is false
        assert calculator.add(5, 10) == 15
        assert calculator.subtract(8, 2) == 6
        assert calculator.multiply(6, 5) == 30
        assert calculator.divide(10, 3) == 3.3333333f

        try {
            calculator.divide(7, 0)
        } catch(RuntimeException e) {
            assert e.getMessage() == "Cannot divide by zero"
        }
    }
}
