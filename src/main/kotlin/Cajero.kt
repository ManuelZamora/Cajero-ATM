class Cajero {

    /**
     * Billetes
     * */
    var veinte: Int
    var cincuenta: Int
    var cien: Int
    var doscientos: Int
    var quinientos: Int
    val usuario: Usuario = Usuario("meny",1234)
    var newValor = 0
    var atmMoney: Int = 5000
    var userMoney: Int = 0

    object billetes {
        const val bVeinte = 20
        const val bCincuenta = 50
        const val bCien = 100
        const val bDoscientos = 200
        const val bQuinientos = 500
    }

    constructor(){
        this.veinte = 20
        this.cincuenta = 50
        this.cien = 100
        this.doscientos = 200
        this.quinientos = 500
    }

    fun addMoneyATM(billete : Int, cantidad : Int ){
        when(billete){
            billetes.bVeinte->{
                veinte += cantidad
                atmMoney += (cantidad * billetes.bVeinte)
            }
            billetes.bCincuenta->{
                cincuenta += cantidad
                atmMoney += (cantidad * billetes.bCincuenta)
            }
            billetes.bCien->{
                cien += cantidad
                atmMoney += (cantidad * billetes.bCien)
            }
            billetes.bDoscientos->{
                doscientos += cantidad
                atmMoney += (cantidad * billetes.bDoscientos)
            }
            billetes.bQuinientos->{
                quinientos += cantidad
                atmMoney += (cantidad * billetes.bQuinientos)
            }
            else ->{
                println("Billete no valido para ingresar!!")
            }
        }

    }


//        atmMoney = readLine()!!.toInt()
//        if (atmMoney > 15000){
//            print("A excedido el monto limite \n")
//        }
//        else{
//            +atmMoney
//        }

    fun addUserMoney(newAmount: Int){
        userMoney += newAmount
    }

    fun subtractUserMoney (subtract: Int){
        userMoney -= subtract
        print("Retiro Exitoso!! \n Saldo: $userMoney")
    }

    fun showUserMoney(){
        print("Su saldo es: $userMoney \n")
    }

    fun showAtmMoney (){
        println("El cajero tiene un monto de: $$atmMoney")
    }




}