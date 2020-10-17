import java.util.*
import kotlin.math.sqrt

fun main() {
    val scan = Scanner(System.`in`)

    val aInt: Double
    val bInt: Double= 3.0

    print("Ingresa el valor de una lado del Triangulo: ")
    aInt=scan.nextDouble()
    println("El Area del Cuadrado es: "+(((sqrt(bInt))/4)*(aInt*aInt)))
}