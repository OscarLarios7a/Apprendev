import java.util.*
fun main(){
    val scan =Scanner(System.`in`)

    var numAInt:Int
    var numBInt:Int

    print("Ingresa el valor del primer Numero: ")
    numAInt=scan.nextInt()

    print("Ingresa el valor del Segundo Numero: ")
    numBInt=scan.nextInt()
    if (numAInt>numBInt){
        print("El valor $numAInt es Mayor que $numBInt ")
    }else if(numAInt<numBInt){
        print("El valor $numAInt es Menor que $numBInt ")
    }else{
        print("El valor $numAInt  y $numBInt son Iguales ")
    }
}