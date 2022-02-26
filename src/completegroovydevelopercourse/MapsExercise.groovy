package completegroovydevelopercourse

class MapsExercise {
    static void main(String[] args) {
        // Create a map of days of the week
        Map map = [1 : 'Monday', 2 : 'Tuesday', 3 : 'Wednesday']

        // Print out the map
        println map

        // Print out the class name of the map
        println map.getClass().getName()

        // Print the size of the map
        println map.size()

        // Print out all of the days - values
        println map.values()

        // Without closures we may have to look at LinkedHashMap
    }
}
