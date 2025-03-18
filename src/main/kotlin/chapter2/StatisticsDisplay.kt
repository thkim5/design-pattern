package chapter2

class StatisticsDisplay(
    private val weatherData: WeatherData
): Observer, DisplayElement {
    private var maxTemp: Float = 0.0f
    private var minTemp: Float = 200f
    private var tempSum: Float = 0.0f
    private var numReadings: Int = 0

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        tempSum += temp
        numReadings++

        if (temp > maxTemp) {
            maxTemp = temp
        }

        if (temp < minTemp) {
            minTemp = temp
        }

        display()
    }

    override fun display() {

        println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp)
    }
}