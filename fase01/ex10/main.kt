fun verifyDays(dayNow: Int, dayPast: Int): Boolean {

    return dayNow > dayPast
}

fun main() {

        val dayNow00: Int = 300
        val dayPast00: Int = 250

        println()
        println("=> The 1º verification is: " + verifyDays(dayNow00, dayPast00))

        println()
        
        val dayNow01: Int = 300
        val dayPast01: Int = 300
        println("=> The 2º verification is: " + verifyDays(dayNow01, dayPast01))

        println()
        
        val dayNow02: Int = 200
        val dayPast02: Int = 220
        println("=> The 3º verification is: " + verifyDays(dayNow02, dayPast02))

        println()
}