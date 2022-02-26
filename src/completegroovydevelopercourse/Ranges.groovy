package completegroovydevelopercourse

class Ranges {
    static void main(String[] args) {
        // Create range from enum
        def dayRange = Days.SUNDAY..Days.THURSDAY

        // Print size of the range
        println dayRange.size()

        // Use contains to see of Wednesday is part of range
        println dayRange.contains(Days.WEDNESDAY)

        // Print the from element of this range
        // start of range
        println dayRange.from

        // Print the to element of this range
        // end of the range
        println dayRange.to
    }
}
