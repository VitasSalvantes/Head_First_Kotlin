package chapter_9

fun main() {
    val a = mutableListOf<String>()
    a.add(0, "Zero")
    a.add(1, "Two")
    a.add(2, "Four")
    a.add(3, "Six")
    println(a)

    if (a.contains("Zero")) a.add("Eight")
    a.removeAt(0)
    println(a)

    if (a.indexOf("Four") != 4) a.add("Ten")
    println(a)

    if (a.contains("zero")) a.add("Twelve")
    println(a)
}