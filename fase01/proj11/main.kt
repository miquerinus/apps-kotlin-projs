fun birthDayGreeting(): String {
    val nameGreeting: String = "Happy Birthday, eder"
    val ageGreeting: String = "You are now 200 yars old !"
    return "$nameGreeting\n$ageGreeting"
}

fun main() {
   println(birthDayGreeting())
}