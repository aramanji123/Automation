// unary operators
// unary plus(+)
//unary minus(-)
//increment(++)
//decrement(--)

def a=5
assert +a==5
println "a:$a"

a=-6
assert a==-6
println "a:$a"

def b=5
def c=b++  //post increment
println "c:$c"

c=b-- //post decrement
println "c:$c"

c=++b //pre increment
println "c:$c"

c=--b //pre decrement
println "c:$c"


