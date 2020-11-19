import fr.learning.Person

fun main(args: Array<String>) {

    val boy = Person("Miguel")
    boy.walk()

    fun showName(value: String) {
        println(value)
    }

    boy.displayName(::showName)


}
