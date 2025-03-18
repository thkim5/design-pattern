package chapter2

import chapter1.FlyRocketPowered
import chapter1.MallardDuck
import chapter1.ModelDuck

fun main(args: Array<String>) {
    val weatherData = WeatherData()

    val currentDisplay = CurrentConditionDisplay(weatherData)

    weatherData.setMeasurements(80f, 65f, 30.4f)
    weatherData.setMeasurements(82f, 70f, 29.2f)
    weatherData.setMeasurements(78f, 90f, 29.2f)

}