fun main() {
    println("Bem-vindo ao Bytebank!")
    val contaArtur = Conta("Artur", 100)
    contaArtur.deposita(1000.0)
    println("titular: ${contaArtur.titular}")
    println("Numero da conta ${contaArtur.numero}")
    println("Saldo: ${contaArtur.saldo}")

    val contaPat = Conta("Patricia", 101)
    contaPat.deposita(2000.0)
    contaPat.deposita(100.0)
    println("titular: ${contaPat.titular}")
    println("Numero da conta ${contaPat.numero}")
    println("Saldo: ${contaPat.saldo}")
//    contaPat.transfere(1000.0, contaArtur)
//    println(contaPat.saldo)
//    println(contaArtur.saldo)
}

class Conta(var titular: String, var numero: Int) {
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