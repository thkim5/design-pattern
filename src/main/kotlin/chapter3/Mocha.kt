package chapter3

class Mocha(beverage: Beverage): CondimentDecorator(beverage) {

    override fun cost(): Double {
        return beverage.cost() + 0.20
    }

    override val description: String
        get() = beverage.description + ", 모카"
}