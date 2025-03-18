package chapter1

class MuteQuack: QuackBehavior {
    override fun quack() {
        println("<< Silence >>")
    }
}