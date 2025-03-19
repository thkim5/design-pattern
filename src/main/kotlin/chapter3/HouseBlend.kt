package chapter3

class HouseBlend: Beverage() {
    override val description: String
        get() = "하우스 블렌드 커피"

    override fun cost(): Double {
        return 0.89
    }
}