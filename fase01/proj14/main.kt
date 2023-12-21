fun birthDayGreeting(name: String = "Rover", age: Int): String {

    return "Happy Birthday, $name ! you are now $age years old"
}

fun main () {

    println(birthDayGreeting(age = 5))
    println(birthDayGreeting("Rex", 2))
}