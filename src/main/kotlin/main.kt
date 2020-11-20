import fr.learning.Person

fun main(args: Array<String>) {
    val boy = Person("Miguel", "3")
    val girl = Person("Miguel", "2")
    val chief = Person("Miguel", "1")
    val unknown = Person("Miguel", "4")
    boy.walk()

    boy.determinePosition()
    girl.determinePosition()
    chief.determinePosition()
    unknown.determinePosition()

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

    //Try statement cool
    val value = try {
        Integer.parseInt(message);
    } catch (exception: NumberFormatException) {
        0
    }
    print(value)

}

class Car {
    //Immutability
    val Date = "12/12/99"
    val Brand = "Toyota"
    var Wheels: Int? = 0
}
