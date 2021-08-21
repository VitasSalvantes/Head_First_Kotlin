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

    convert(12.0) { cc: Double -> cc * 1.8 + 32 }
    convertFive { dd: Int -> dd * 1.8 + 32 }
    convertFive { it * 1.8 + 32 }
}

fun convert(x: Double, converter: (Double) -> Double): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun convertFive(converter: (Int) -> Double): Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}