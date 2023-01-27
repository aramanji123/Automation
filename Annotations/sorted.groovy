package Annotations

import groovy.transform.*

@Sortable
@ToString
class person {

    String firstname
    String lastname

}

def p1=new person(firstname:"new",lastname:"techie")
def p2=new person(firstname:"new",lastname:"developer")

def people=[p1,p2]
println people

def sorted=people.sort (false)
println sorted


