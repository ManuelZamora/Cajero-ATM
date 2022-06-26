class Usuario {


    var user = ""
    var nip = 0

    constructor(user: String, nip: Int){
        this.user = user
        this.nip = nip
    }

    fun createUser(){
        /**
         * Declaración de variables
         */

        print("!Eres nuevo :), creemos una cuenta¡\n")
        print("Inserte su usuario \n")
        this.user = readLine().toString()
        print("Ingrese su NIP \n")
        this.nip = readLine()!!.toInt()
    }

}