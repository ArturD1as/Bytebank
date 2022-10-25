fun main() {
    println("Bem-vindo ao Bytebank!")
    val contaArtur = Conta()
    contaArtur.titular = "Artur"
    contaArtur.numero = 100
    contaArtur.saldo = 1000.0
    println(contaArtur.titular)
    println(contaArtur.numero)
    println(contaArtur.saldo)

    val contaPat = Conta()
    contaPat.titular = "Patricia"
    contaPat.numero = 101
    contaPat.saldo = 2000.0
    contaPat.deposita(100.0)
    println(contaPat.titular)
    println(contaPat.numero)
    println(contaPat.saldo)
    contaPat.transfere(1000.0, contaArtur)
    println(contaPat.saldo)
    println(contaArtur.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
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
            destino.saldo += valor
            return true
        }
        return false

    }
}