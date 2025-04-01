package LSP

interface Ecendible{
    fun encender()
}

class Televisor: Ecendible{
    override fun encender(){
        println("Encendiendo televisor")
    }
}

class Radio{
    fun sintonizar(){
        println("Sintonizando radio")
    }
}

fun main(){
    val televisor= Televisor()
    val radio= Radio()
    televisor.encender()
    radio.sintonizar()
}