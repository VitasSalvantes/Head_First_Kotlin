package chapter_2

import kotlin.random.Random

fun main() {
    val nouns = arrayOf("milk", "dog", "ferrari")
    val adjectives = arrayOf("Super", "Sexy", "Bad")
    val participles = arrayOf("made", "saw", "loved")

    val randomNounIndex = Random.nextInt(until = nouns.size)
    val randomAdjectiveIndex = Random.nextInt(until = adjectives.size)
    val randomParticipleIndex = Random.nextInt(until = participles.size)

    println("${adjectives[randomAdjectiveIndex]} ${participles[randomParticipleIndex]} ${nouns[randomNounIndex]}")
}