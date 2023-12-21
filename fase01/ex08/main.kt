fun displayAlertMessage(sys: String, emailId: String): String {

    return "There's a new sign-in request on $sys for your Google Account $emailId"
}

fun main () {

    val firstUserSysOps: String = "Unknow OS" 
    val firstUserEmailId: String  = "user_one@gmail.com"
   
    println("\n")
    println(displayAlertMessage(firstUserSysOps,firstUserEmailId))
    println()

    val secondUserSysOps: String = "Windows"
    val secondUserEmailId: String  = "user_two@gmail.com"

    println(displayAlertMessage(secondUserSysOps, secondUserEmailId))
    println()

    val thirdUserSysOps: String = "MAC Os"
    val thirdUserEmailId: String  = "user_three@gmail.com" 

    println(displayAlertMessage(thirdUserSysOps, thirdUserEmailId))
    println()
}