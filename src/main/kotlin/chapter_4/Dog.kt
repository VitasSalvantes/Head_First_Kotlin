package chapter_4

class Dog(val name: String, var weight: Int, breed_param: String) {
    lateinit var temperament: String

    init {
        println("Dog $name has been created.")
    }

    val activities = arrayOf("Walks")
    val breed = breed_param.uppercase()

    init {
        println("He has weight $weight kg, breed $breed and activities: ${activities.joinToString()}")
    }

    fun bark() {
        println(if (weight > 20) "Woof!" else "Yip!")
    }
}

fun main() {
    val myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight = 19
    myDog.bark()
}