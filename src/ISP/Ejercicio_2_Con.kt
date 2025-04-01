package ISP

interface Trabajador{
    fun trabajar()
}

interface Administrador{
    fun administrar()
}
interface Auditor{
    fun auditar()
}
class Desarrollador: Trabajador{
    override fun trabajar(){
        println("Desarrollando software")
    }
}
fun main(){
    val desarrollador= Desarrollador()
    desarrollador.trabajar()
}