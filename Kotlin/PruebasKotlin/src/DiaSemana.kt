import java.util.*
fun main(){
    val scan =Scanner(System.`in`)
    var diaSemanaInt:Int

    print("Ingresa el Valor : ")
    diaSemanaInt=scan.nextInt()

    when(diaSemanaInt){
        1-> print(" El dia es Lunes")
        2-> print(" El dia es Martes")
        3-> print(" El dia es Miercoles")
        4-> print(" El dia es Jueves")
        5-> print(" El dia es Viernes")
        6-> print(" El dia es Sabado")
        7-> print(" El dia es Domingo")
        else -> {
            print(" No es un dia de la Semana")
        }
    }

}