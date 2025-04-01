package LSP

open class Figura{
    open fun calcularArea(): Int {
        return 0
    }
}

class Cuadrado(var lado: Int): Figura(){
    override fun calcularArea(): Int {
        return lado * lado
    }
}

class Rectangulo(var base:Int, var altura:Int): Figura(){
    override fun calcularArea(): Int {
        return base * altura
    }
}

fun main(){
    val cuadrado= Cuadrado(4)
    val resctangulo= Rectangulo(5, 10)
    println("Area del cuadrado: ${cuadrado.calcularArea()}")
    println("Area del rectangulo: ${resctangulo .calcularArea()}")

}