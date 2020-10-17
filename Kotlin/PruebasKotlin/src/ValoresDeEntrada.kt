fun main(){

    val nombreString:String
    val numeroInt:Int
    val numeroDosInt:Int

    print("Ingresa tu Nombre: ")
    nombreString= readLine()?.toString() as String

    print("Ingresa un Numero: ")
    numeroInt= readLine()?.toInt() as Int

    print("Ingresa un Numero 2: ")
    numeroDosInt= readLine()?.toInt() as Int

    print("Tu nombre es '$nombreString' " + " la suma de los 2 numeros ingresados es:"+(numeroInt+numeroDosInt))
}