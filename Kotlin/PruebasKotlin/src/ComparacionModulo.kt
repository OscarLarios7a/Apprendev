import java.util.*
fun main(){
    val scan =Scanner(System.`in`)
    var numAInt:Int

    print("Ingresa un valor: ")
    numAInt=scan.nextInt()

    if(numAInt%2==0){
        print("El numero $numAInt es divisible entre 2 ")
    }else {
        print("El numero $numAInt no es divisible entre 2 ")
    }
}