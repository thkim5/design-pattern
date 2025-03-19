package chapter3

class DarkRoast: Beverage() {
    override val description: String
        get() = "다크 로스트 커피"

    override fun cost(): Double {
        return 0.99
    }
}