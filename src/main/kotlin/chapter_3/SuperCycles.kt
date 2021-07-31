package chapter_3

fun main() {
    for (x in 1..10) print("$x ")
    println()
    for (x in 1 until 10) print("$x ")
    println()
    for (x in 10 downTo 1) print("$x ")
    println()
    for (x in 1..10 step 2) print("$x ")
    println("\n")

    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (item in array) println("$item is an item in the array")
    println()
    for (index in array.indices) println("Index $index has item ${array[index]}")
    println()
    for ((index, item) in array.withIndex()) println("Index $index has item $item")
}