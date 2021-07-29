package chapter_2

fun main() {
    val typeByte: Byte = 1
    val typeShort: Short = 12
    val typeInt: Int = 123
    val typeLong: Long = 1234
    val typeFloat: Float = 1.2F
    val typeDouble: Double = 1.23
    val typeBoolean: Boolean = true
    val typeChar: Char = 'A'
    val typeString: String = "ABCD"
    val typesInKotlin = 9

    var myArray = arrayOf(1, 2, 3)
    var sizeOfMyArray = myArray.size


    val newTypeShort = typeByte.toShort()
    val newTypeInt = typeShort.toInt()
    val newTypeLong = typeInt.toLong()
    val newTypeFloat = typeLong.toFloat()
    val newTypeDouble = typeFloat.toDouble()
    val newTypeByte = typeDouble.toInt().toByte()

    println(
        "There are $typesInKotlin types of variables in Kotlin:" +
                "\n$newTypeByte" +
                "\n$newTypeShort" +
                "\n$newTypeInt" +
                "\n$newTypeLong" +
                "\n$newTypeFloat" +
                "\n$newTypeDouble" +
                "\n$typeBoolean" +
                "\n$typeChar" +
                "\n$typeString"
    )
}