package attachment_c

import chapter_8.Duck

open class Parent {
    var a = 1
    private var b = 2
    protected open var c = 3
    internal var d = 4
}

class Child : Parent() {
    public override var c = 6
}

private fun doStuff() {
    println("Some text...")
}

internal fun saySomething() {
    println("I say")
}

enum class BandMember(val instrument: String) {
    JERRY("lead guitar") {
        override fun sings() = "plaintively"
    },
    BOBBY("rhythm guitar"),
    PHIL("bass");

    open fun sings() = "occasionally"
}

sealed class MessageType {
    class MessageSuccess(var msg: String) : MessageType()
    class MessageFailure(var msg: String, var e: Exception) : MessageType()
}

class Outer {
    val x = "This is in the Outer class"
    val myInner = Inner()

    class Nested {
        val y = "This is in the Nested class"
        fun myFun() = "This is the Nested function"
    }

    inner class Inner {
        val inner = Outer().myInner
        val y = "This is in the Inner class"
        fun myFun() = "This is the Inner function"
        fun getX() = "The value of x is: $x"
    }

    companion object {
        fun create(): Duck = Duck()
    }
}

object DuckManager {
    val allDucks = mutableListOf<Duck>()
    fun herdDucks() {
        // Some code...
    }
}

fun Double.toDollar(): String {
    return "$$this"
}

fun <T> valuesToList(vararg vals: T): MutableList<T> {
    val list: MutableList<T> = mutableListOf()
    for (i in vals) {
        list.add(i)
    }
    return list
}

fun main(args: Array<String>) {
    val selectedBandMember: BandMember
    selectedBandMember = BandMember.JERRY
    println(selectedBandMember.instrument)
    println(selectedBandMember.sings())

    val messageSuccess = MessageType.MessageSuccess("Yay!")
    val messageSuccess2 = MessageType.MessageSuccess("It worked!")
    val messageFailure = MessageType.MessageFailure("Boo!", Exception("Gone wrong."))
    val myMessageType: MessageType = messageFailure
    val myMessage = when (myMessageType) {
        is MessageType.MessageSuccess -> myMessageType.msg
        is MessageType.MessageFailure -> myMessageType.msg + " " + myMessageType.e.message
    }
    println(myMessage)

    val nested = Outer.Nested()
    println(nested.y)
    println(nested.myFun())

    val inner = Outer().Inner()
    println(inner.y)
    println(inner.myFun())
    println(inner.getX())

    val x = Outer.Companion

    val startingPoint = object {
        val x = 0
        val y = 0
    }

    myloop@ while (true) {
        while (true) {
            if (true) break@myloop
        }
    }

    val myArray = arrayOf(1, 2, 3, 4, 5)
    val mList = valuesToList(*myArray)
    val mList2 = valuesToList(0, *myArray, 6, 7)
}