package fr.learning

class Person(var Name: String, var Position: String) {

    fun walk() {
        println("$Name can walk only")
    }

    fun displayName(func: (name: String) -> Unit) {
        func(Name)
    }

    //When Statement 😍
    fun determinePosition() {
        when(Position) {
            "1" -> println("You are Chief")
            "2" -> println("You are Teacher")
            "3" -> println("You are Student")
            else -> println("Undefined position")
        }
    }
}
