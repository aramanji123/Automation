package Annotations

//import groovy.transform.*

import groovy.transform.Sortable
import groovy.transform.ToString



@Sortable
@ToString
//@ToString(includeNames=True)
class person {

    String firstname
    String lastname
    int age 
    Date since = new Date()
    String colour

}

def p1=new person(firstname:"new",lastname:"techie",age:23,colour:"white")
def p2=new person(firstname:"new",lastname:"developer",age:24,colour:"black")


def people=[p1,p2]
println people

def sorted=people.sort (false)
println sorted


