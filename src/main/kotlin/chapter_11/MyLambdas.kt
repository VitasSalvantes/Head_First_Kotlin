package chapter_11

typealias DoubleConversion = (Double) -> Double

fun main() {
    val a = { "Pow!" }
    val b = { x: Int -> x + 5 }
    val add: (Int, Int) -> Int
    add = { x: Int, y: Int -> x + y }
    val c: (Int) -> Int = { x -> x + 4 }
    val d: (Int) -> Int = { it + 3 }
    val sayHi: () -> Unit = { println("Hi!") }

    sayHi()
    println(a)
    println(b.invoke(10))
    println(add(10, 5))
    println(c(90))
    println(d(18))

    convert(12.0) { cc: Double -> cc * 1.8 + 32 }
    convertFive { dd: Int -> dd * 1.8 + 32 }
    convertFive { it * 1.8 + 32 }

    val lambda1 = getConversionLambda("KgsToPounds")
    val convertedValue = getConversionLambda("CentigradeToFahrenheit")(20.0)
    println(convertedValue)

    val kgsToPounds: DoubleConversion = {it * 2.204623}
    val poundsToUSTons: DoubleConversion = {it / 2000.0}
    val kgsToUSTons = combine(kgsToPounds, poundsToUSTons)
    val usTons = kgsToUSTons(1000.0)
    println(usTons)
}

fun convert(x: Double, converter: (Double) -> Double): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun convertFive(converter: (Int) -> Double): Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

fun getConversionLambda(str: String): (Double) -> Double {
    when (str) {
        "CentigradeToFahrenheit" -> {
            return { it * 1.8 + 32 }
        }
        "KgsToPounds" -> {
            return { it * 2.204623 }
        }
        "PoundsToUSTons" -> {
            return { it / 2000.0 }
        }
        else -> {
            return { it }
        }
    }
}

fun combine(lambda1: DoubleConversion, lambda2: DoubleConversion): DoubleConversion {
    return {x -> lambda2(lambda1(x))}
}