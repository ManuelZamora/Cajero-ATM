class Usuario(var user: String, var nip: Int, var saldo: Int) {

    fun createUser(){
        /**
         * Declaración de variables
         */

        print("!Eres nuevo :), creemos una cuenta¡\n")
        print("Inserte su usuario \n")
        this.user = readLine().toString()
        print("Ingrese su NIP \n")
        this.nip = readLine()!!.toInt()
        print("ingrese la cantidad a depositar")
        this.saldo = readLine()!!.toInt()
    }

}