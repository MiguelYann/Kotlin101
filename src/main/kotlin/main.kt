import fr.learning.Person

fun main(args: Array<String>) {
    val boy = Person("Miguel")
    boy.walk()

    fun showName(value: String) {
        println(value)
    }

    boy.displayName(::showName)

    val carOne = Car()
    carOne.Wheels = 4

    // Mark as nullable
    val carTwo: Car? = null

    //Safe operator
    carTwo?.Wheels = null

    //If as an Expression
    val message = if (carOne.Wheels == carTwo?.Wheels) {
        "We have 2 car"
    } else {
        "Not cars"
    }
    println(message)

}

class Car {
    //Immutability
    val Date = "12/12/99"
    val Brand = "Toyota"
    var Wheels: Int? = 0
}
