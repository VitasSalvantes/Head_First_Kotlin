package chapter_4

class Dog(val name: String, var weight: Int, val breed: String) {

    fun bark() {
        println(if (weight > 20) "Woof!" else "Yip!")
    }
}

fun main() {
    val myDog = Dog("Fido", 70, "Mixed")
    println("${myDog.name}, ${myDog.weight}, ${myDog.breed}.")
    myDog.bark()
    myDog.weight = 19
    myDog.bark()
}