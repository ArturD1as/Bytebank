fun testaComportamentoConstas() {

    val contaArtur = Conta(titular = "Artur", numero = 100)
    contaArtur.deposita(1000.0)

    println("titular: ${contaArtur.titular}")
    println("Numero da conta ${contaArtur.numero}")
    println("Saldo: ${contaArtur.saldo}")

    val contaPat = Conta(numero = 101, titular = "Patricia")
    contaPat.deposita(2000.0)
    contaPat.deposita(100.0)

    println("titular: ${contaPat.titular}")
    println("Numero da conta ${contaPat.numero}")
    println("Saldo: ${contaPat.saldo}")

    if (contaPat.transfere(2000.0, contaArtur)) {
        println("Transferencia bem sucedida!")
    } else {
        println("Flaha na transferencia")

    }

    println("saldo Patricia: ${contaPat.saldo}")
    println("saldo Artur ${contaArtur.saldo}")
}

