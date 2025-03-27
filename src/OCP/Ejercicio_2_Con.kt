package OCP

interface envio{
    fun enviar(archivo: String)
}

class ftp : envio{
    override fun enviar(archivo: String) {
        println("Enviando archivo por FTP: $archivo")
    }
}

class http: envio{
    override fun enviar(archivo: String) {
        println("Enviando archivo por HTTP: $archivo")
    }
}

class invalido :envio {
    override fun enviar(archivo: String) {
        println("tipo de envio no soportado")
    }
}
class envioarchivo{
    fun enviar(archivo: String, tipo: envio){
        tipo.enviar(archivo)
    }
}

fun main(){
    val envio = envioarchivo()
    val envioftp = ftp()
    val enviohttp = http()
    val envioinvalido = invalido()

    envio.enviar("documento.txt", envioftp)
    envio.enviar("documento.txt", enviohttp)
    envio.enviar("documento.txt", envioinvalido)
}


