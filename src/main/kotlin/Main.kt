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
    println(contaPat.titular)
    println(contaPat.numero)
    println(contaPat.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}