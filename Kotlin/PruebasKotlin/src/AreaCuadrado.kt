import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    val aInt: Double

    print("Ingresa el valor de una lado del Cuadrado: ")
    aInt=scan.nextDouble()
    println("El Area del Cuadrado es: "+(aInt*aInt).toInt())
}