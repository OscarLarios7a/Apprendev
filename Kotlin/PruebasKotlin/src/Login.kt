import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var  passwordString: String
    var flagInt: Int=1

  while(flagInt<=3){
      println("No. Intento:$flagInt")
      print("Ingresa la Contraseña: ")
      passwordString=scan.nextLine()
      if (passwordString == "Larios"){
          println("Contraseña Correcta")
          println("Acceso Concedido")
          break
      }else{
          println("Contraseña Incorrecta")
          ++flagInt
      }

  }
}