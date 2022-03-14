fun main(){
    var R = product(arrayOf(10,20,30))
    println(R)
    var A = add(arrayOf(2.2,3.1F,1.1,"True", 5, "Salma"))
    println(A)
     var l=getvowel(arrayOf('b','c','d','a','e','i','o'))
    println(l)


}
fun product(numbers:Array<Int>):Int{
    var results = 1
    numbers.forEach { p->
        results*=p

    }
    return results
}
fun add(numbers: Array<Any>):Double{
    var Jibu = 0.0
    numbers.forEach { N ->
        if (N is Double|| N is Float){
            Jibu+=N.toString().toDouble()
        }
    }
    return Jibu
}
fun getvowel(vowels:Array<Char>):Int{
    var L =0
    vowels.forEach { V ->

        if (V == 'a'|| V=='e'|| V== 'i'|| V=='o'|| V=='u') {
            L++

        }


    }
    return L

}

