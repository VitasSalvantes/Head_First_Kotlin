package chapter_3.rock_paper_scissors

import kotlin.random.Random

fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
}

fun getGameChoice(options: Array<String>) = options[Random.nextInt(until = options.size)]