package chapter_8

class BadException : Exception()

fun main() {
    val firstTest = "No"
    val secondTest = "Yes"

    riskyCode(firstTest)
    println()
    riskyCode(secondTest)
}

fun riskyCode(test: String) {
    print("t")
    print("h")

    try {
        if (test == "Yes") throw BadException()
        print("r")
        print("o")
    } catch (e: BadException) {
        print("a")
    } finally {
        print("w")
        print("s")
    }
}