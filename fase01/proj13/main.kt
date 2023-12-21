fun birthDayGreeting(name: String, age: Int): String {

    val nameGreeting: String = "Happy birthday, $name"
    val ageGreeting: String = "You are now $age years old"

    return "$nameGreeting\n$ageGreeting"

}

fun main() {

    println(birthDayGreeting("eder", 200))
    println(birthDayGreeting("bernardo", 5))
}