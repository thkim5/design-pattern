package chapter3

class Whip(beverage: Beverage): CondimentDecorator(beverage) {
    override fun cost(): Double {
        return beverage.cost() + 1.10
    }

    override val description: String
        get() = beverage.description + ", 휘핑 크림"
}