import java.util.*
fun main(){
    //Este objeto scanea el Teclado
    val scan=Scanner(System.`in`)

    val aFloat:Float
    val bFloat:Float

    print("Ingresa el valor de 'a': ")
    aFloat=scan.nextLine().toFloat()
    print("Ingresa el valor de 'b': ")
    bFloat=scan.nextLine().toFloat()

    print("La Division de $aFloat / $bFloat = "+(aFloat/bFloat))
}