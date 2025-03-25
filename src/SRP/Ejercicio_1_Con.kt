package SRP

class Producto(val nombre: String, val precio: Double)

class CalcularDescuento{
    fun calculardescuento(producto: Producto, porcentaje: Double): Double {
        return producto.precio - (producto.precio * porcentaje / 100)
    }
}

class ProductoPrinter{
    fun imprimirdetalles (producto: Producto){
        println("Producto: ${producto.nombre},Precio:${producto.precio}")
    }
}

fun main(){
    val producto = Producto("Laptop", 1500.0)
    val calcular = CalcularDescuento()
    val printer = ProductoPrinter()
    println("Precio con descuento: ${calcular.calculardescuento(producto,10.0)}")
    printer.imprimirdetalles(producto)
}


