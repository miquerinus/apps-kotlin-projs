fun welcomeFunction() {

    println("Bem vindo ao programa para calcular")
}

fun addFunction(num01: Int, num02: Int): Int {

    return num01 + num02
} 

fun main() {

     welcomeFunction()
     println("Insert A value for add: ")
     val userInputA: Int = readLine()!!.toInt()
     
     println("Insert B value for add:  ")
     val userInputB: Int = readLine()!!.toInt()

     println("The sum of $userInputA and $userInputB is:  " + addFunction(userInputA, userInputB))
}