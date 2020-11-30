package fr.myt.learning.companions

fun main(args: Array<String>) {
    EngineFactory.createBike("Yamaha")
    EngineFactory.createCar("Peugeot")
}
class EngineFactory {
    companion object {
        @JvmStatic // Can be call on java like a static method because of that annotation
        fun createCar(brand: String): Car {
            return Car(brand)
        }

        fun createBike(brand: String): Bike {
            return Bike(brand)
        }
    }
}

data class Car(val brand: String)
data class Bike(val brand: String)
