package fr.myt.learning.types.interfaces

interface SalaryGenerator {
    //Simple abstract method
    fun computeBonus(previousSalary: Double) : Double

    //Default method too
    fun savePlan(salary: Double) = computeBonus(0.0)
}

interface WayPayment {
    fun defineLocation() : String
}

//Override two interfaces
class ChristmasSalaryPlan : SalaryGenerator, WayPayment {
    private val bonusAmount = 50;
    override fun computeBonus(previousSalary: Double): Double {
        return previousSalary + bonusAmount
    }

    override fun defineLocation(): String {
        return "Santa Claus"
    }
}

//Multiple interface with same default methods
interface Writer {
    fun greeting() = print("Hello by Writer")
}

interface Journalism {
    fun greeting() = print("Hello by Journalist")
}

//Class must specify which method of interface must be call
class Person : Writer, Journalism {
    override fun greeting() {
        super<Writer>.greeting()
    }
}
