package fr.myt.learning.types.classes

open class Player {
    // 💡 Class Player can now be extended by others classes

    // Because of open this method can be override, without it it's make final by default
    open fun dunk() = println("Dunk on everybody 😅")
}

class CamPlayer : Player() {
    override fun dunk() = print("I'm Dunking too because of OPEN keyword 😆")
}

//abstract class
abstract class Human {

    abstract fun changeName(name: String): String // Must be override

    fun think() = println("think like a Human") // Can't be override

    // May be override if you Want
    open fun chooseGoal(goals: Array<String>): String {
        return "Nothing"
    }
}

