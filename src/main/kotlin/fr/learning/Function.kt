package fr.learning

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

fun minimum(a: Int, b: Int): Int = if (a > b) b else a
