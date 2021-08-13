package chapter_8

class Dog(val name: String, var age: Int)

fun main() {
    var bob: Dog? = Dog("Bob", 12)
    val myArray: Array<String?> = arrayOf("Hello", "Hi", null)

    bob?.age = 2
    println(bob?.age)

    var c = bob!!.age

    bob?.let {
        println(it.age)
    }

    println(bob?.age ?: 1)

    bob = null
    println(bob?.age)

    bob?.let {
        println("Bob. Just Bob.")
    }
}