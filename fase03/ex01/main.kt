// - removi os parametros para os valores das variaveis ser mutaveis
fun addFunction(): Int {
    println("=> Insert 1º value: ")
    val num1 = readLine()!!.toInt()
    println("=> Insert 2º value: ")
    val num2 = readLine()!!.toInt()
    return num1 + num2
} 

fun subFunction(): Int {
    println("=> Insert 1º value: ")
    val num1 = readLine()!!.toInt()
    println("=> Insert 2º value: ")
    val num2 = readLine()!!.toInt()
    return num1 - num2
}

fun divFunction(): Int {
    println("=> Insert 1º value: ")
    val num1 = readLine()!!.toInt()
    println("=> Insert 2º value: ")
    val num2 = readLine()!!.toInt()
    return num1 / num2
}

fun multFunction(): Int {
    println("=> Insert 1º value: ")
    val num1 = readLine()!!.toInt()
    println("=> Insert 2º value: ")
    val num2 = readLine()!!.toInt()
    return num1 * num2
}

fun menuFunction() {

    println("************ Calculadora em Kotlin **************")
    println() 
    println("1 => for addition\n2 => for subtration\n3 => for division\n4 => for multiplication")

    println()
    val choiceOperator: Int = readLine()!!.toInt()

    val result  = when (choiceOperator) {
        1 -> addFunction()
        2 -> subFunction()
        3 -> divFunction()
        4 -> multFunction()
        else -> {
                 println("Incorret option value ...")
                 0
        }
    }
    println("the result is: $result")
}

fun main() {
    menuFunction()
}