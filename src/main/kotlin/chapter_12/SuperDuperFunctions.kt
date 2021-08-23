package chapter_12

data class Grocery(
    val name: String, val category: String,
    val unit: String, val unitPrice: Double,
    val quantity: Int
)

fun main() {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    val highestUnitPrice = groceries.maxByOrNull { it.unitPrice }
    val lowestQuantity = groceries.minByOrNull { it.quantity }
    val sum = groceries.sumOf { it.quantity * it.unitPrice }

    println("$highestUnitPrice\n$lowestQuantity\n$sum")

    val vegetables = groceries.filter { it.category == "Vegetable" }

    val ints = setOf(1, 2, 3, 4)
    val doubleInts = ints.map { it * 2 }
    val groceryNames = groceries.map { it.name }
    val newPrices = groceries.filter { it.unitPrice > 3 }.map { it.unitPrice * 2 }
    newPrices.forEach { println(it) }

    var itemNames = ""
    groceries.forEach { itemNames += it.name }

    val groupByCategory = groceries.groupBy { it.category }
    println(groupByCategory)

    groceries.groupBy { it.category }.forEach {
        println(it.key)
        it.value.forEach { println(" ${it.name}") }
    }

    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    val names = groceries.fold("") { string, item -> string + " ${item.name}" }
    println("names: $names")
    println("-----------------------------")

    val finallySum = groceries.filter { it.category == "Vegetable" }
        .sumOf { it.unitPrice * it.quantity }

    val sale = groceries.filter { it.unitPrice * it.quantity < 5.0 }.map { it.name }
    println(sale)

    val priceForCategory = groceries.groupBy { it.category }
        .forEach { println("${it.key}: ${it.value.sumByDouble { it.unitPrice * it.quantity }}") }
}