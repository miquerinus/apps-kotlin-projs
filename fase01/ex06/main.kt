fun add(fitN: Int, secN: Int): Int {

   return fitN + secN 
}

fun sub(fitN: Int, secN: Int): Int {

   return fitN - secN 
}

fun mult(fitN: Int, secN: Int): Int {

    return fitN * secN
}

fun main () {

    val number1: Int = 10
    val number2: Int = 5
    val number3: Int = 8

    println("\n")

    println("The sum of numbers is: ") 
    println("=> $number1 + $number2 = " + add(number1, number2))
    println("=> $number1 + $number2 = " + add(number1, number3))

    println("\n")

    println("The sub of numbers is: ")
    println("=> $number1 - $number2 = " + sub(number1, number2))
    println("=> $number1 = $number3 = " + sub(number1, number3))

    println("\n")

    println("the mult of numbers is: ")
    println("=> $number1 * $number2 = " + mult(number1, number2))
    println("=> $number1 * $number3 = " + mult(number1, number3))

}