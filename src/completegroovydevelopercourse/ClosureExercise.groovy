package completegroovydevelopercourse

class ClosureExercise {
    static void main(String[] args) {
        // Method or function
        def helloWorld = {
            println 'Hello World'
        }

        sayHello(helloWorld)

        // Lists
        List names = ['Adam', 'Andrew', 'Ben']
        names.each { name ->
            println name
        }

        // Maps
        Map teams = [basketball: 'Lakers', rugby: 'All Blacks', soccer: 'Barcelona']
        teams.each { k, v ->
            println "$k = $v"
        }

        def greet = { String greeting, String name ->
            println "$greeting $name"
        }

        greet("Hello", "King")

        def sayTalofa  = greet.curry("Talofa")
        sayTalofa("King")

        // GDK - Groovy Development Kit
        List people = [
                [name: 'Ben', city: 'Auckland'],
                [name: 'Sam', city: 'Auckland'],
                [name: 'Mary', city: 'Wellington'],
        ]
        println people.find { person -> person.city == 'Auckland' }
        println people.findAll { person -> person.city == 'Auckland' }
        // any and every
        println people.any { person -> person.city == 'Auckland' }
        println people.every { person -> person.city == 'Auckland' }
        // Name greater or equal to 3
        println people.every { person -> person.name.size() >= 3 }
        // People by city
        def peopleByCity = people.groupBy {
            person -> person.city
        }
        println peopleByCity
        def aucklanders = peopleByCity['Auckland']
        def wellingtonians = peopleByCity.Wellington
        aucklanders.each {
            println it.name
        }
        wellingtonians.each {
            println it.name
        }
    }

    static def sayHello(Closure c) {
        c()
    }
}
