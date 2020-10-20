import java.util.*

fun main(){
  val scan= Scanner(System.`in`)
    val a=5
    val b=10
    val c=12
    when {
        a != b -> {
            if (a==c){

            } else  {
                //Este es Otro cuerpo de otra condicion
                println("Los Valores no son Iguales")
            }
        }
        else -> {
            // este es el cuerpo de una condición
            println("Los Valores son Iguales")
        }
    }
}