package chapter3

class Espresso: Beverage() {
    override val description: String
        get() = "에스프레소"

    override fun cost(): Double {
        return 1.99
    }
}