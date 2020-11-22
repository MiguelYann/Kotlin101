@file:JvmName("Do")

package fr.myt.learning.function

fun doSomething() {
    print("I'm defined on a package")
}


@JvmOverloads
fun discoverLanguage(language: String = "Java") {
// In Java code, call me even if I know you don't like it
}



//Extend functions
fun String.makePluralOf(): String {
    return "${this}s";
}

fun main(args: Array<String>) {
    val firstName = "Miguel"
    val lastName = "Yann"
 val fullName = firstName append lastName
    print(fullName)
}

//INFIX function
infix fun String.append(word: String): String {
    return "$this $word"
}
