package completegroovydevelopercourse

class ListExercise {
    static void main(String[] args) {
        // Create a list of days
        def days = ['Monday', 'Tuesday', 'Wednesday']

        // Print out the list
        println days

        // Print size of list
        println days.size()

        // Remove Wednesday from the list
        // pop removes the initial item of the list
        days.removeLast()
        println days

        // Add Wednesday back
        days << 'Wednesday'
        println days

        // Print out Wednesday using index
        println days[2]
    }
}
