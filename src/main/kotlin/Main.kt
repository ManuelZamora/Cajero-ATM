fun main(args: Array<String>) {
    val cajero = Cajero()
    val usuario = Usuario("meny",1234, 1500)
    val user = usuario.user
    var nip = usuario.nip
    var saldo = usuario.saldo
    var userList = mutableListOf<Usuario>()
    userList.add(usuario)
    var i = 0

    print("!Bienvenido¡ \n");

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
            "a" -> {
                var more = ""
                do {
                    print("Seleccione billete a ingresar: \n20\n50\n100\n200\n500\n")
                    var sAmount = readLine()!!.toInt()
                    print("Ingrese cantidad a ingresar de $sAmount \n")
                    var amountAtm = readLine()!!.toInt()
                    cajero.addMoneyATM(sAmount, amountAtm)
                    print("¿Desea ingresar más billetes? s / n \n")
                    more = readLine().toString()
                }while (more == "s")

            }
            "b" -> {
                print("Ingrese su usuario \n")
                var user = readLine()!!
                var ue = false
                i = 0
                for(u in userList){
                    if ( u.user == user){
                        ue = true
                        break
                    }
                    i ++
                }
                if (ue){
                    print("Ingrese su NIP \n")
                    var nip = readLine()!!.toInt()
                        print("Ingrese la cantidad a retirar \n")
                        var userMoney = readLine()!!.toInt()
                        if (userMoney == cajero.atmMoney){
                            cajero.subtractMoney(userMoney)
                        }
                }else print("No existe el usuario \n")
            }
            "c" -> {
                usuario.createUser()
                userList.add(Usuario(user, nip, saldo))
                for (i in userList) print("${i.user} \n")
            }
            "d" -> {
                print("Ingrese su usuario \n")
                var user = readLine()!!
                var ue = false
                i = 0
                for(u in userList){
                    if ( u.user == user){
                        ue = true
                        break
                    }
                    i ++
                }
                if (ue){
                    print("Ingrese su NIP \n")
                    var nip = readLine()!!.toInt()
                    print("Ingrese la cantidad a depositar \n")
                    var userMoney = readLine()!!.toInt()
                    cajero.addMoney(userMoney)
                }else {
                    print("No existe el usuario \n")
                }
            }
            "e" -> {
                print("Ingrese su usuario \n")
                var user = readLine()!!
                var ue = false
                i = 0
                for(u in userList){
                    if ( u.user == user){
                        ue = true
                        break
                    }
                    i ++
                }
                if (ue){
                    print("Ingrese su NIP \n")
                    var nip = readLine()!!.toInt()
                    cajero.showUserMoney()
                }else print("No existe el usuario \n")
            }
            "f" -> cajero.showAtmMoney()
            "s" -> break
            else -> println("Opción no valida \n")
        }
    }
}
