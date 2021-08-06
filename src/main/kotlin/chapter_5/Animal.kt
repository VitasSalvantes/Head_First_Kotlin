package chapter_5

abstract class Animal {
    abstract val img: String
    abstract val food: String
    abstract val habitat: String
    val hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    open fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
}