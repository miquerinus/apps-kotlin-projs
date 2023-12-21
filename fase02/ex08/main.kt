fun main() {

    val x: Int = 4 

    // - verifica se X é ou não um numero primo (não tem a formula, é somente um exemplo ilustrativo)
    when(x) {

        2, 3, 5, 7 -> println("$x is a prime number between 1 and 10")
        // - estabelece uma espaço para percorrer entre numero x (inicio) e numero y (final)
        in 1..10 -> println("$x is a number between 1 and 10, but not a prime number")
        else -> println("$x isn't a prime number between 1 and 10")
    }
}