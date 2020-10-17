import java.util.*

fun main(){

    val scan=Scanner(System.`in`)
    // val scan2=Scanner(System.`in`)

    var edadInt:Int
    var emailString:String=""

    print("Ingresa tu Edad: ")
    edadInt=scan.nextLine().toInt()

    print("Ingresa tu Email: ")
    emailString=scan.nextLine()

    print("Tu Edad es: '$edadInt' y tu Email es: '$emailString' ")

}