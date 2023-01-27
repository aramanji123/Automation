package control_structures

String message =''

for (int i=0;i<5;i++) {
    message +='hi:)'
    //println "$message"
}

println "$message"



def facts=[]
def count=5

for (int fact =1,i=1;i<=count;i++,fact *=i) {
    facts<<fact
    
}
println "$facts"



//multi assignments with types
def (String x, int y) = ['foo',42]
assert "$x $y" == 'foo 42'
println "$x $y"


def (String a,int b) = ["hi",40]
assert "$a $b" == 'hi 40'
println "$a  $b"


// multi-assignment goes loopy
def baNums = []
for (def (String u, int v) = ['bar', 42]; v < 45; u++, v++) {
    baNums << "$u $v"
}
assert baNums == ['bar 42', 'bas 43', 'bat 44']
println "$baNums"



/*** for in loop ***/

//iterate over the Range
 def z=0
 for (i in 0..9) {
    z+=i
 }
 assert z == 45
 println "$z"

 //iterate over the list

 z=0
 for (i in [0,1,2,3,4]) {
    z +=i
 }
 assert z ==10
 println "$z"


 //iterate over an array
 def array =(0..4).toArray()
 println"array:$array"
 w=0
 for (i in array) {
    w +=i
 }
 assert w==10
 println "$w"


//iterate ove map
def map = ['abc':1, 'def':2, 'xyz':3]
println "map:$map"
d = 0
for ( e in map ) {
    d += e.value
}
assert d == 6
println"$d"

//iterate over values in a map
f = 0
for ( v in map.values() ) {
    f += v
}
assert f == 6
println"$f"

// iterate over the characters in a string
def text = "abc"
def list = []
for (c in text) {
    list.add(c)
}
assert list == ["a", "b", "c"]
println "$list"


