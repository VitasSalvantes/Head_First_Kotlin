package chapter_7

class Mushroom(val size: Int, val isMagic: Boolean = true) {
    constructor(isMagic_param: Boolean) : this(0, isMagic_param)
}