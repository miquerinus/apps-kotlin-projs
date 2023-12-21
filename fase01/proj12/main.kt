fun birthDayGreeting(name: String) : String {

    val nameGreeting: String = "Happy Birthday, $name"
    val ageGreeting: String = "You are now 90 years old"
    
    return "$nameGreeting\n$ageGreeting"
}

fun main () {

    println(birthDayGreeting("eder"))
    println(birthDayGreeting("Bernardo"))
}