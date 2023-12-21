fun messages(name00: String, name01: String): String {

    val myName: String = "Ola tudo, bem $name00 ?"
    var yourName: String = "Sim, tudo bem $name01"

    return "$myName\n$yourName"
}
fun main() {

  println(messages("eder", "Bernardo")) 
}