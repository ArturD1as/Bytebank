fun testaContas() {
    val contaCorrente = ContaCorrente(
        titular = "Artur",
        numero = 1001
    )

    val contaPoupanca = ContaPoupanca(
        titular = "beg",
        numero = 1002
    )

    contaPoupanca.deposita(1000.0)
    contaCorrente.deposita(1000.0)

    println("saldo conta poupança: ${contaPoupanca.saldo}")
    println("saldo conta corrente: ${contaCorrente.saldo}")

    contaPoupanca.saca(100.0)
    contaCorrente.saca(100.0)

    println("--------------------------------------------------")
    println("saldo conta poupança apos saque: ${contaPoupanca.saldo}")
    println("saldo conta corrente apos saque: ${contaCorrente.saldo}")
    println("--------------------------------------------------")

    contaCorrente.transfere(400.0, contaPoupanca)

    println("Saldo conta poupança apos tranferencia: ${contaPoupanca.saldo}")
    println("Saldo conta corrente apos tranferencia: ${contaCorrente.saldo}")
}