package completegroovydevelopercourse

class ASTTransformations {
    // Exercise: use two more AST Transformations
    // Already saw @ToString ast transformation
    static void main(String[] args) {
        def todo = new Todo('New Todo')
        //println todo.toString()
        // Add @ToString to see below output
        // Converts object to string
        // completegroovydevelopercourse.Todo(New Todo, false, Sat Feb 26 07:56:54 NZDT 2022, 0)
        //println todo.getLikes().toString()

        // @EqualsAndHashCode
        def p1 = new Person(firstName: 'Jack', lastName: 'Nicholson')
        def p2 = new Person(firstName: 'Jack', lastName: 'Nicholson')
        // assert or show error if false
        assert p1 == p2
        assert p1.hashCode() == p2.hashCode()
//        println p1.hashCode()
//        println p2.hashCode()

        // @TupleConstructor
        // traditional map-style constructor
        def person1 = new Person(firstName: 'Jack', lastName: 'Nicholson')
        // generated tuple constructor
        def person2 = new Person('Jack', 'Nicholson')
        // generated tuple constructor with default value for second property
        def person3 = new Person('Jack')
        //println person3.toString()
        // Output: completegroovydevelopercourse.Person(Jack, null)

        // @Canonical
        def d = new Date()
        def anyObject = new Object()
        def c1 = new Customer(first: 'King', last: 'Ioane', age: 21, since: d,
                favItems: ['Gaming', 'Programming'], object: anyObject)
        def c2 = new Customer('King', 'Ioane', 21, d,
                ['Gaming', 'Programming'], anyObject)
        // assert if false
        assert c1 == c2

        // @Sortable - now we can sort in order of property
        def ps1 = new Person(firstName: 'Jack', lastName: 'Nicholson')
        def ps2 = new Person(firstName: 'Adam', lastName: 'Blair')
        def people = [ps1, ps2]
        println people
        // Sorts by alphabetical order
        def sorted = people.sort(false)
        println sorted
    }
}
