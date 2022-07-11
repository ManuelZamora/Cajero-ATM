class Cajero() {

    /**
     * Billetes
     * */
    var veinte: Int
    var cincuenta: Int
    var cien: Int
    var doscientos: Int
    var quinientos: Int
    var atmMoney: Int = 5000
    var userMoney: Int = 0

    object billetes {
        const val bVeinte = 20
        const val bCincuenta = 50
        const val bCien = 100
        const val bDoscientos = 200
        const val bQuinientos = 500
    }

    init {
        this.veinte = 20
        this.cincuenta = 50
        this.cien = 100
        this.doscientos = 200
        this.quinientos = 500
    }


    fun addMoneyATM(billete : Int, cantidad : Int ){
            when (billete) {
                billetes.bVeinte -> {
                    veinte += cantidad
                    atmMoney += (cantidad * billetes.bVeinte)
                }
                billetes.bCincuenta -> {
                    cincuenta += cantidad
                    atmMoney += (cantidad * billetes.bCincuenta)
                }
                billetes.bCien -> {
                    cien += cantidad
                    atmMoney += (cantidad * billetes.bCien)
                }
                billetes.bDoscientos -> {
                    doscientos += cantidad
                    atmMoney += (cantidad * billetes.bDoscientos)
                }
                billetes.bQuinientos -> {
                    quinientos += cantidad
                    atmMoney += (cantidad * billetes.bQuinientos)
                }
                else -> {
                    println("Billete no valido para ingresar!!")
                }
            }
    }

    fun addMoney(newAmount: Int){
        userMoney += newAmount
        atmMoney += newAmount
    }


    fun subtractMoney (subtract: Int){
        userMoney -= subtract
        atmMoney -= subtract
        print("Retiro Exitoso!! \n Saldo: $userMoney MXN \n")
    }

    fun showUserMoney(){
        print("Su saldo es de: $userMoney MXN \n")
    }

    fun showAtmMoney (){
        println("El cajero tiene un monto de: $$atmMoney MXN \n")
    }



}