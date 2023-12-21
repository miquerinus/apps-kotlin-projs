fun displayAlertMessage(sys: String, mail: String): String {

        return "There's a new sign-in request on $sys for your Google Account $mail"
}

fun main() {

        val operatingSys: String  = "Chrome OS"
        val emailID: String = "sample@gmail.com"
        
        println(displayAlertMessage(operatingSys,emailID))

}

