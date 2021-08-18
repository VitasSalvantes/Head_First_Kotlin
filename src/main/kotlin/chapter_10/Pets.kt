package chapter_10

abstract class Pet(var name: String)

class dog(name: String) : Pet(name)

class cat(name: String) : Pet(name)

class fish(name: String) : Pet(name)

class contest<T : Pet> {

    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int) {
        if (score >= 0) scores.put(t, score)
    }

    fun getWinners(): MutableSet<T> {
        val maxValue: Int
        val highScore = scores.values.maxOrNull()
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores) {
            if (score == highScore) winners.add(t)
        }
        return winners
    }
}