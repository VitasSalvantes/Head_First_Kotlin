package chapter_4

class Dogs(val name: String, var weight: Int, val breed: String) {

    fun bark() {
        println(if (weight > 20) "Woof!" else "Yip!")
    }
}

fun main() {
    val myDogs = Dogs("Fido", 70, "Mixed")
    println("${myDogs.name}, ${myDogs.weight}, ${myDogs.breed}.")
    myDogs.bark()
    myDogs.weight = 19
    myDogs.bark()
}