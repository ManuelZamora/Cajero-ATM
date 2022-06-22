class Cajero {

    val usuario: Usuario = Usuario()

    var atmMoney: Int = 0
    var userMoney: Int = 0

    fun addMoneyATM(){
        print("Ingrese la cantidad a depositar en el cajero \n")
        atmMoney = readLine()!!.toInt()
        if (atmMoney > 15000){
            print("A excedido el monto limite \n")
        }
        else{
            +atmMoney
        }
    }

    fun addUserMoney(){
        print("Inserte la cantidad a depositar en su cuenta \n")
        userMoney = readLine()!!.toInt()
        +userMoney
    }

    fun subtractUserMoney (){
        print("Inserte su usuario \n")
        usuario.user = readLine().toString()
        print("Inserte su NIP \n")
        usuario.nip = readLine()!!.toInt()
        /**
         * Condicion
         * */
        print("Ingrese la cantidad a retirar \n")
        userMoney = readLine()!!.toInt()
        -userMoney
        print("Retiro Exitoso!! \n")
    }

    fun showUserMoney(){
        print("Su saldo es: $userMoney \n")
    }

    fun showAtmMoney (){
        println("El cajero tiene un monto de: $$atmMoney")
    }



}