package chapter1

class MallardDuck: Duck(
    flyBehavior = FlyWithWings(),
    quackBehavior = Quack()
) {
    fun display() {
        println("I'm a real Mallard duck")
    }
}