package classes
@groovy.transform.ToString()

class developer {

    def first
    def last
    def languages=[]

    void work (){
        println "$first $last is working"

        println"languages:$languages"

        for(i in languages)
        {
            println"language:$i"
        }
    }
}


