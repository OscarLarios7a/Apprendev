import java.util.*

fun main(){
    val scan= Scanner(System.`in`)

    val aInt:Double
    val bInt:Double

    print("Ingresa el valor de 'a': ")
    aInt=scan.nextDouble()
    print("Ingresa el valor de 'b': ")
    bInt=scan.nextDouble()

    println("La Suma de $aInt + $bInt = "+(aInt+bInt).toInt())
    println("La Resta de $aInt - $bInt = "+(aInt-bInt).toInt())
    println("La Multiplicacion de $aInt * $bInt = "+(aInt*bInt).toInt())
    println("La Division de $aInt / $bInt = "+(aInt/bInt))
}