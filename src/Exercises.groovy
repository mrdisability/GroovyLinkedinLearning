import java.awt.TexturePaintContext

class Exercises {
    static void main(String[] args) {

        def instrument = 'IN Cell'
        def software='HCS Explorer'
        def t = [12, 24, 48, 72]

        println "The network share drive used for $instrument images has grown so large that the nightly job to index images for " +
                "visibility in $software had started running for up to ${t[3]} hours."
    }
}
