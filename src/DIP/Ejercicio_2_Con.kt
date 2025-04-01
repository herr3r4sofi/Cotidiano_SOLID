package DIP


interface Motor {
    fun encender()
}

class MotorElectrico : Motor {
    override fun encender() {
        println("Motor eléctrico encendido")
    }
}

class MotorGasolina : Motor {
    override fun encender() {
        println("Motor de gasolina encendido")
    }
}

class Vehiculo(private val motor: Motor) {
    fun arrancar() {
        motor.encender()
    }
}

fun main() {
    val motorElectrico = MotorElectrico()
    val vehiculoElectrico = Vehiculo(motorElectrico)
    vehiculoElectrico.arrancar()

    val motorGasolina = MotorGasolina()
    val vehiculoGasolina = Vehiculo(motorGasolina)
    vehiculoGasolina.arrancar()
}