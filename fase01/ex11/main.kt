fun verifyClimate(city: String, low: Int, high: Int, prob: Int): String {

    val cit: String = "City: $city"
    val lowTemp: String =  "Low temperature is: $low"
    val highTemp: String = "High temperature is: $high" 
    val probChance: String = "Chance of rain: $prob%"
    
    return "$cit\n$lowTemp\n$highTemp\n$probChance"
}

fun main() {


    println()
    println(verifyClimate("Ankara", 27, 31, 82))
    println()

    println(verifyClimate("Tokyo", 32, 36, 10))
    println()

    println(verifyClimate("Cape Town", 59, 64, 2))
    println()

    println(verifyClimate("Guatemal City", 50, 55, 7))
    println()

}