class RecursiveLoop {
    // recursive loop that prints a 2d array in groovy
    static void main(String[] args) {
        List l1 = ['A', 'B', 'C', 'D', 'E']
        List l2 = ['a', 'b', 'c', 'd', 'e']

        List screen = [l1, l2]

        // 2 - amount of lists
        2.times { y ->
            // 5 - amount of items
            5.times { x ->
                println screen[y][x]
            }
        }
    }
}
