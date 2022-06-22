fun main(args: Array<String>) {
    val cajero : Cajero = Cajero()
    val usuario : Usuario = Usuario()

    var nip = usuario.nip

    print("!Bienvenido¡ \n");
    if (nip === 0){
        usuario.createUser()
    }

    var opcion = ""
    while (opcion != "s"){
        println("Ingrese la opcion deseada \n")
        print("a) Depositar a cajero \n")
        print("b) Retirar Efectivo\n")
        print("c) Crear cuenta nueva \n")
        print("d) Depositar a cuenta \n")
        print("e) Estado de cuenta \n")
        print("f) Estado del cajero \n")
        print("s) salir\n")
        print("--------------------------------------------------------- \n")
        opcion = readLine().toString()
        when(opcion){
            "a" -> cajero.addMoneyATM()
            "b" -> cajero.subtractUserMoney()
            "c" -> usuario.createUser()
            "d" -> cajero.addUserMoney()
            "e" -> cajero.showUserMoney()
            "f" -> cajero.showAtmMoney()
            "s" -> break
            else -> println("Opción no valida \n")
        }
    }
}
