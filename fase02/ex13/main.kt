fun main() {
    // - Opção 2 de expressão if/else
    val trafficLightColor: Any = "Black"

    val message = 
    if (trafficLightColor == "Red") "Stop"
    else if (trafficLightColor == "Yellow") "Slow"
    else if (trafficLightColor == "Green") "Go"
    else "Invalid traffic-light color"

    println(message)
}