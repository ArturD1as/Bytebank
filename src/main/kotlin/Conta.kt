class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Valor de saque excedeu o limite")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            println("transferindo de ${this.titular} para ${destino.titular}")
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false

    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if (valor > 0){
//            saldo = valor
//        }
//
//    }
}