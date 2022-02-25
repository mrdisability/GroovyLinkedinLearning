class SevenGuesses {
    // you can also try the 7 guesses game for a number within 100
    static void main(String[] args) {
        def randomNumber = (new Random()).nextInt(100) + 1

        def guessAmount = 7

        println "the secret number is $randomNumber"

        print 'Guess a number: '
        System.in.withReader { reader ->
            String response
            while (response = reader.readLine()) {
                if (!response.isNumber())
                    print "that's not a number! try again: "
                else {
                    def guess = response as Integer

                    // if guessAmount != 0, else
                    if (guessAmount != 0) {
                        if (guess < randomNumber) {
                            println 'Too low, try again: '
                            guessAmount = guessAmount - 1
                            println "Guesses Left: $guessAmount"
                        } else if (guess > randomNumber) {
                            println 'Too high, try again: '
                            guessAmount = guessAmount - 1
                            println "Guesses Left: $guessAmount"
                        } else {
                            println "That's right"
                            break
                        }
                    }else {
                        println "You have ran out of guesses"
                        println "Guesses Left: $guessAmount"
                        break
                    }
                }
            }
        }
    }
}
