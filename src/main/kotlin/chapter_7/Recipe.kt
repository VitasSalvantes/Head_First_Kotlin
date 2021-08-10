package chapter_7

data class Recipe(
    val title: String,
    val mainIngridient: String,
    val isVegetarian: Boolean = false,
    val difficulty: String = "Easy"
) {

}

fun main() {
    val recipe1 = Recipe(mainIngridient = "Milk", title = "Milkshake")
    var recipe2 = Recipe("Pommes", mainIngridient = "Potato")

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

    val (title, mainIngredient, vegetarian, difficulty) = recipe1
    println("title is $title and vegetarian is $vegetarian")

    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    val m2 = Mushroom(true)
    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")
    println(addNumbers(2, 5))
    println(addNumbers(1.6, 7.3))
}

fun findRecipes(
    title: String = "",
    ingridient: String = "",
    isVegetarian: Boolean = false,
    difficulty: String = ""
): Array<Recipe> {
    return arrayOf(Recipe(title, ingridient, isVegetarian, difficulty))
}

fun addNumbers(a: Int, b: Int) : Int {
    return a + b
}
fun addNumbers(a: Double, b: Double) : Double {
    return a + b
}