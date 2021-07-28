package chapter_1

fun main() {
    var x = 1
    val y = 2

    println(if(x > y) "x greater than y" else "y greater than x")

    println("Before the loop. x = $x")

    while (x < 4) {
        println("In the loop. x = $x")
        x++
    }

    println("After the loop. x = $x")
}