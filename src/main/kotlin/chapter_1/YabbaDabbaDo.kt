package chapter_1

fun main() {
    var x = 1

    while (x < 3) {
        print(if (x == 1) "Yab" else "Dab")
        print("ba")
        x++
    }
    if (x == 3) print("Do")
}