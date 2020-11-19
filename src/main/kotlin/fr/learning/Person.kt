package fr.learning

class Person(var Name: String) {

    fun walk() {
        println("$Name can walk only")
    }

    fun displayName(func: (name: String) -> Unit) {
        func(Name)
    }
}
