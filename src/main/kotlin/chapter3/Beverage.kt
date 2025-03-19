package chapter3

abstract class Beverage {
    open val description = "제목 없음";
    abstract fun cost(): Double
}