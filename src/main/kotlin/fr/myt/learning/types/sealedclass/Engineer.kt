package fr.myt.learning.types.sealedclass

sealed class Engineer(var name: String) {
    class Developer(name: String) : Engineer(name)
    class Devops(name: String) : Engineer(name)
    class Administrator(name: String) : Engineer(name)
}

fun defineTask(engineer: Engineer) = when(engineer) {
    is Engineer.Developer -> print("${engineer.name} You are developer")
    is Engineer.Devops -> print("${engineer.name} You are devops")
    is Engineer.Administrator -> print("${engineer.name} You are administrator")
}


fun main(args: Array<String>) {
    val developer = Engineer.Developer("Miguel");
    defineTask(developer);
}
