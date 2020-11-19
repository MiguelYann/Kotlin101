import fr.learning.Person

fun main(args: Array<String>) {

    val boy = Person("Miguel")
    boy.walk()

    fun showName(value: String) {
        println(value)
    }

    boy.displayName(::showName)


    val car = Car()
}

class Car {

    //Immutability
    val Date = "12/12/99"
    val Brand = "Toyota"
}
