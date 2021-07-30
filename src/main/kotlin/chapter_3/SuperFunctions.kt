package chapter_3

fun main() {
    val a = 12
    val b = 11

    println(sumInt(a, b))
    maxInt(a, b)
    println(multiInt(a, b))
}

fun sumInt(firstInt: Int, secondInt: Int): Int {
    return firstInt + secondInt
}

fun maxInt(firstInt: Int, secondInt: Int): Unit {
    val maxInt = if (firstInt > secondInt) firstInt else secondInt
    println(maxInt)
}

fun multiInt(firstInt: Int, secondInt: Int): Int = firstInt * secondInt