package chapter_5

class Wolf : Canine() {
    override val food = "meat"
    override val img = "wolf.jpg"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooowl!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}