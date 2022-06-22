class Usuario {

    var user = ""
    var nip = 0

    fun createUser(){
        /**
         * Declaración de variables
         */
        var userName = this.user
        var userNip = this.nip

        print("!Eres nuevo :), creemos una cuenta¡\n")
        print("Inserte su usuario \n")
        this.user = readLine().toString()
        print("Ingrese su NIP \n")
        this.nip = readLine()!!.toInt()
    }

    fun showUser(){
        print("Su usuario $user \n su NIP $nip \n")
    }


}