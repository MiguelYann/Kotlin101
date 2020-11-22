package fr.myt.learning.init

fun main(args: Array<String>) {
    sayHelloTo("Miguel")
   println(minimum(3,9))
}

//simple declaration
fun sayHelloTo(name: String): String {
    return "Hello $name From amazing function"
}

//If function returns nothing, then hit nothing
fun doAnything() {
    println("No void Keyword like on java")
}

// Function as an expression,

fun minimum(firstValue: Int, secondValue: Int): Int = if (firstValue > secondValue) secondValue else firstValue
