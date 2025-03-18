package chapter2

class ForecastDisplay(
    private val weatherData: WeatherData
): Observer, DisplayElement {
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }
    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Forecast: ")
    }
}