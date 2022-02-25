package completegroovydevelopercourse

import groovy.transform.EqualsAndHashCode
import groovy.transform.Sortable
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@EqualsAndHashCode
@TupleConstructor
@ToString
@Sortable
class Person {
    String firstName
    String lastName
}
