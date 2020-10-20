import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var numAInt:Int

    print("Ingresa el Valor : ")
    numAInt=scan.nextInt()

    if (numAInt>0){
        println("la Tabla de Multiplicar es: ")
        for (i in 1..10){
            println("$numAInt" + " X "+ "$i" + "="+(numAInt*i))
        }
    }else{
        print("El Valor ingresado no es Positivo")
    }

}