package chapter_7

data class Recipe(val title: String, val isVegetarian: Boolean)

fun main() {
    val recipe1 = Recipe("Milk", false)
    var recipe2 = Recipe("Potato", true)

    println(recipe1 == recipe2)

    recipe2 = recipe1

    println(recipe1 === recipe2)

    recipe2 = recipe1.copy(title = "Apple")

    println(recipe1 === recipe2)

    println(recipe1.toString())
    println(recipe2.hashCode())

    val title1 = recipe1.component1()
    val vegetarian1 = recipe1.component2()
    val (title2, vegetarian2) = recipe1
}