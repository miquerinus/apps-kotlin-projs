class SmartDevice {

    val name: String = "Android Tv"
    val category: String = "Entertainment"
    var deviceStatus: String = "online"

    // - funções de membro / metodo
    fun turnOn() {
        println("Smart device is turned on")
    }

    // - funções de membro / metodo
    fun turnOff() {
        println("Smart device is turned off")
    }
}

fun main() {

    // - criando uma instancia do objeto SmartDevice
    val smartTvDevice = SmartDevice()
    println("Device name is: ${smartTvDevice.name}")
    println("Device category is: ${smartTvDevice.category}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}