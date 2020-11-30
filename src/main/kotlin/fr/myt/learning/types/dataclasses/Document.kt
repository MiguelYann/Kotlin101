package fr.myt.learning.types.dataclasses

// Data class auto generate toString, equals and hashcode methods for us. This is an immutable class
data class Document(val name: String, val numberPages: Int)

fun main(args: Array<String>) {
    val report = Document("Kotlin learning", 30)
    val firstCopyOf = report.copy(name = "Java Learning")
    val sameReport = Document("Kotlin learning", 30)
    sameReport == firstCopyOf // TRUE
    print(report == firstCopyOf)
}
