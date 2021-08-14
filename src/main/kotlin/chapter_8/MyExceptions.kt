package chapter_8

fun main() {
    myFunction("I'm string, not a number!")

    try {
        setWorkRatePercentage(110)
    } catch (e: IllegalArgumentException) {
        println("Error!!!")
    }
}

fun myFunction(str: String) {
    val result = try {
        str.toInt()
    } catch (e: Exception) {
        null
    }

    try {
        val x = str.toInt()
        println(x)
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        println(str)
    } finally {
        println("myFunction has ended")
    }

    println(result)
}

fun setWorkRatePercentage(x: Int) {
    if (x !in 0..100) {
        throw IllegalArgumentException("Percentage not in range 0..100: $x")
    }

    println(x)
}