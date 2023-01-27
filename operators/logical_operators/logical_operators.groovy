//logical operators
//&& : logical "and"
//|| : logical "or"
//! :logical "not"

//logical "and" (&&)
def a=true
def b=true
assert a&&b
println "a:$a,b:$b "

//logical "or"(||)
a=false
b=true
assert a||b
println "a:$a,b:$b"


//logical "not"(!)
def c=false
assert !c
println "c:$c"