package DIP

interface ServicioMensajeria {
    fun enviarMensaje(mensaje: String)
}

class EmailService : ServicioMensajeria {
    override fun enviarMensaje(mensaje: String) {
        println("Enviando correo: $mensaje")
    }
}

class Notificador(private val servicioMensajeria: ServicioMensajeria) {
    fun notificar(mensaje: String) {
        servicioMensajeria.enviarMensaje(mensaje)
    }
}

fun main() {
    val emailService = EmailService()
    val notificador = Notificador(emailService)
    notificador.notificar("Hola Mundo!")
}