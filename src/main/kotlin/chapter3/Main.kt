package chapter3

fun main(args: Array<String>) {
    val beverage = Espresso()
    println("${beverage.description} $${beverage.cost()}")

    var beverage2:Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println("${beverage2.description} $${beverage2.cost()}")


}