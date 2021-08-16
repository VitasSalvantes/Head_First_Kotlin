package chapter_9

fun main() {
    val listik = listOf("First", "Second", "Third")

    if (listik.isNotEmpty()) println(listik[0])
    println("--------------------------------")
    for (item in listik) println(item)
    println("--------------------------------")
    if (listik.contains("Second")) println(listik.indexOf("Second"))
    println("--------------------------------")

    val shopping = mutableListOf("Milk", "Chips", "Cola")
    shopping.add("Eggs")
    shopping.add(1, "Tea")
    println(shopping.toString())
    println("--------------------------------")
    if (shopping.contains("Chips")) shopping.remove("Chips")
    if (shopping.size > 3) shopping.removeAt(2)
    println(shopping.toString())
    println("--------------------------------")
    if (shopping.contains("Tea")) shopping[shopping.indexOf("Tea")] = "Coffee"
    shopping.sort()
    shopping.reverse()
    println(shopping.toString())
    println("--------------------------------")
    shopping.shuffle()
    for (item in shopping) println(item)
    println("--------------------------------")
    shopping.addAll(listik)
    println(shopping.toString())
    println("--------------------------------")
    shopping.removeAll(listik)
    println(shopping.toString())
    println("--------------------------------")
    shopping.addAll(listik)
    shopping.retainAll(listik)
    println(shopping.toString())
    println("--------------------------------")
    shopping.clear()
    println(shopping.toString())
    println("--------------------------------")
    shopping.add("Beer")
    var newShopping = shopping.toList()
    println(newShopping.toString())
    println("--------------------------------")
    newShopping = newShopping.sorted()
    println(newShopping.toString())
    println("--------------------------------")
    newShopping.reversed()
    println(newShopping.toString())
    println("--------------------------------")
    newShopping.shuffled()
    println(newShopping.toString())
    println("--------------------------------")

}