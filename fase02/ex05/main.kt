fun main() {

    val trafficLightColor: String = "Green"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}