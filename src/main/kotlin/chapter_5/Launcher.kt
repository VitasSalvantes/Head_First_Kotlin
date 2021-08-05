package chapter_5

fun main() {
    val animals = arrayOf(Wolf(), Hippo())
    val vet = Vet()

    for (item in animals) {
        item.roam()
        item.eat()
        vet.giveShot(item)
    }
}