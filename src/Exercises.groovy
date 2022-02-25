class Exercises {
    // recursive loop that prints a 2d array in groovy
    // you can also try the 7 guesses game for a number within 100

    static void main(String[] args) {

        def instrument = 'IN Cell'
        def software='HCS Explorer'
        def t = [12, 24, 48, 72]

        println "The network share drive used for $instrument images has grown so large that the nightly job to index images for " +
                "visibility in $software had started running for up to ${t[3]} hours."
    }
}
