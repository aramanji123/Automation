//identical(===)
//not identical(!==)

/*
*Both === and !== are supported which are the same as calling the is() method,
*and negating a call to the is() method respectively.
*/

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class creature {
    String type
} 
def dog=new creature(type:'dog')
def copydog=dog
def lion=new creature(type:'dog')
assert dog==lion
assert dog.equals(lion)
assert dog.is(copydog) //groovy identity
assert dog===copydog//operator shorthand
assert dog !==lion//negated operator shorthand
//println "type:$dog"
//println "type:$lion"