package chapter_5

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

    for (item in roamables) {
        item.roam()
    }
}