package chapter_3.rock_paper_scissors

import kotlin.random.Random

fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
}

fun getGameChoice(options: Array<String>) = options[Random.nextInt(until = options.size)]

fun getUserChoice(options: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        println("Please enter one of the following:")
        for (item in options) print(" $item")
        println(".")

        val userInput = readLine()

        if (userInput != null && userInput in options) {
            isValidChoice = true
            userChoice = userInput
        }

        if (!isValidChoice) println("You must enter a valid choice!\n")
    }

    return userChoice
}