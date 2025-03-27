package SRP

class Cliente(val nombre: String, val edad: Int)

class ClienteRepository {
    fun guardar(cliente: Cliente) {
        println("Guardando cliente en la base de datos...")
    }
}

class enviarprinter {
    fun enviarCorreo(cliente: Cliente) {
        println("Enviando correo a ${cliente.nombre}...")
    }
}

fun main() {
    val cliente = Cliente("Carlos", 28)
    val repository = ClienteRepository()
    val emailService = enviarprinter()

    repository.guardar(cliente)
    emailService.enviarCorreo(cliente)
}