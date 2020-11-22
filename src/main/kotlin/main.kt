import fr.learning.Person
import kotlin.collections.HashMap

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
    val car: Car? = Car()

    //Then Safe operator does all 🚔
    car?.Wheels = 8

    //If as an Expression
    val age = 25
    val message = if (age > 18) {
        "We are major"
    } else {
        "Not yet major"
    }
    println(message)

    //Try statement cool
    val defaultValue = 0
    val value = try {
        Integer.parseInt("You must throw exception");
    } catch (exception: NumberFormatException) {
        defaultValue
    }
    println(value)

    //Ranges
    val rangeOf = 1..10
    for (i in rangeOf) {
        println("value $i")
    }
    for (i in 1 until  10 step 2) {
        println("value $i")
    }

    //Define easily list of string
    val programmingLanguages = listOf("Java","Kotlin","JavaScript", "Dart")

    // For access index of a list, 👋🏽 For loop
    for ((index, language) in programmingLanguages.withIndex()) {
        println("Language $language stay at $index position")
    }

    //Loop on that list
    for(language in programmingLanguages) {
        println(language)
    }


    // Define map
    val heightOfPlayers = HashMap<Double,String>()
    heightOfPlayers[1.91] = "Curry"
    heightOfPlayers[2.05] = "Giannis"
    heightOfPlayers[2.02] = "Kevin D"

    // Loop on that map finish Map.Entries unless you use Stream
    for((height, player) in heightOfPlayers) {
        println("Player $player has $height")
    }

}

class Car {
    //Immutability
    val Date = "12/12/99"
    val Brand = "Toyota"
    var Wheels: Int? = 0
}
