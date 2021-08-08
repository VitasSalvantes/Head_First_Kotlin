package chapter_5

import chapter_6.Roamable
import chapter_6.Vehicle

fun main() {
    val animals = arrayOf(Wolf(), Hippo())
    val vet = Vet()

    for (item in animals) {
        item.roam()
        item.eat()
        vet.giveShot(item)
    }

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    println()

    for (item in roamables) {
        item.roam()
        when (item) {
            is Wolf -> {
                item.makeNoise()
                item.eat()
            }
            is Hippo -> item.sleep()
            is Vehicle -> item.roam()
            else -> println("Who are you?")
        }
        println()
    }

    var r: Roamable = Wolf()
    if (r is Wolf) {
        var wolf = r as Wolf
        wolf.eat()
    }
}