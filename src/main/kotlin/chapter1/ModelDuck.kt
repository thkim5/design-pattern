package chapter1

class ModelDuck: Duck(
    flyBehavior = FlyNoWay(),
    quackBehavior = Quack()
) {
    fun display() {
        println("I'm a model duck")
    }
}