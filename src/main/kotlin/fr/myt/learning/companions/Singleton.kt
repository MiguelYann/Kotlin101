package fr.myt.learning.companions

/**
 * It creates a class and provide only one instance
 * It is a class so can implements interface and can extend another class
 */
object Singleton : Comparable<Int> {
    val sentence = "Kotlin will give us an instance"
    override fun compareTo(other: Int): Int {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>) {
    print(Singleton.sentence)
}
