package chapter_11

fun main() {
    val a = { "Pow!" }
    val b = { x: Int -> x + 5 }
    val add: (Int, Int) -> Int
    add = { x: Int, y: Int -> x + y }
    val c: (Int) -> Int = { x -> x + 4 }
    val d: (Int) -> Int = { it + 3 }
    val sayHi: () -> Unit = { println("Hi!") }

    sayHi()
    println(a)
    println(b.invoke(10))
    println(add(10, 5))
    println(c(90))
    println(d(18))

}