fun main() {

    val trafficLightColor: Any = "Amber"

    when (trafficLightColor) {

        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}