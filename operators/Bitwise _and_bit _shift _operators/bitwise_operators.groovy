// 4 bitwise operators

//& :bitwise "and"
//| :bitwise "or"
//^ : bitwise "exclusive or"
// ~ : bitwise negation


int a = 0b00101010
assert a == 42
println "a:$a"

int b = 0b00001000
assert b == 8
println "b:$b"

assert (a & a) == a                     
assert (a & b) == b                     
assert (a | a) == a                     
assert (a | b) == a                     

int mask = 0b11111111                   
assert ((a ^ a) & mask) == 0b00000000   
assert ((a ^ b) & mask) == 0b00100010   
assert ((~a) & mask)    == 0b11010101   
