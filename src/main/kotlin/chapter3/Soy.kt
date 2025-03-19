package chapter3

class Soy(beverage: Beverage): CondimentDecorator(beverage) {
    override fun cost(): Double {
        return beverage.cost() + 0.10
    }

    override val description: String
        get() = beverage.description + ", 두유"
}