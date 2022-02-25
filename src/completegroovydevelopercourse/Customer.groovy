package completegroovydevelopercourse

import groovy.transform.Canonical

// Collection of ast transformations including @ToString
@Canonical
class Customer {
    // first, last, age, since, favItems, object
    String first, last
    int age
    Date since
    Collection favItems = ['Food']
    def object
}

