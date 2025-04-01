package ISP

interface Encendible{
    fun encender()
    fun apagar()
}
interface conectarwifi{
    fun conectarWifi()
}
interface Actualizable{
    fun actualizarFirmware()
}
class Lampara: Encendible{
    override fun encender(){
        println("Encendiendo la lampara")
    }
    override fun apagar(){
        println("Apagando la lampara")
    }

}
fun main(){
    val lampara= Lampara()
    lampara.encender()
    lampara.apagar()
}
