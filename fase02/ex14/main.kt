fun main() {

    // - converterndo instrução when para uma expressão

    val trafficLightColor: String = "Amber"

    val message = when (trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Proceed with caution"
        "Green" ->  "Go"
         else -> "Invalid traffic-light color"
    }

    println(message)
 }