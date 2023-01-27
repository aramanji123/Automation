package control_structures

def x="foo"

def result=""

switch(x) {
    case "foo":
          result="found foo"
          println "$result"
    case "bar":
          result += "bar"   
          println "$result"
    case [4,5,6,'inlist'] :
          result="list"
          println "$result"
          //break
    case 12..30:
         result =" range"
         println "$result"
         break
    case Integer:
         result="Integer"
         break
    case number:
         result="number"
         break
          
    case ~/fo*/: // toString() representation of x matches the pattern?
        result = "foo regex"
        break

    case { it < 0 }: // or { x < 0 }
        result = "negative"
        break

    default:
        result = "default"
}
