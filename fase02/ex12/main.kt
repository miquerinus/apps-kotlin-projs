// - Convertendo uma instrução if/else para uma expressão if/else

fun main() {

    val trafficLightColor: Any = "Black"

    val message: Unit = if (trafficLightColor == "Red") {
        println("Stop")
    
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    
    } else if(trafficLightColor == "Green") {
        println("Go")
    
    } else {
        println("Invalid traffic-light color")
    } 
}