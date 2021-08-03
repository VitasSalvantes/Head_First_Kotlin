package chapter_4

class Dog(val name: String, var weight_param: Int, breed_param: String) {
    lateinit var temperament: String

    init {
        println("Dog $name has been created.")
    }

    val activities = arrayOf("Walks")
    val breed = breed_param.uppercase()

    // SETTER
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    init {
        println("He has weight $weight kg, breed $breed and activities: ${activities.joinToString()}")
    }

    // GETTER
    val weightInKgs: Double
        get() = weight / 2.2

    fun bark() {
        println(if (weight > 20) "Woof!" else "Yip!")
    }
}

fun main() {
    val myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight = 18
    myDog.bark()
    println(myDog.weightInKgs)
}