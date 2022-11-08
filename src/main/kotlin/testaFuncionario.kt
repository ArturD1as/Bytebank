fun testaFuncionario() {
    val artur = Gerente(
        nome = "artur",
        cpf = "111.111.111-11",
        salario = 10000.0,
        senha = 1234,
    )

    println("nome: ${artur.nome}")
    println("cpf: ${artur.cpf}")
    println("salario: ${artur.salario}")
    println("senha: ${artur.senha}")
    println("bonificação: ${artur.bonificacao()}")

    if (artur.autentica(1234)) {
        println("Sucesso na autenticação!")
    } else {
        println("Falha na autenticação!")
    }

    val pat = Analista(
        nome = "Patricia",
        cpf = "222.222.222-22",
        salario = 5000.0,
    )

    println("-----------------------------")
    println("nome: ${pat.nome}")
    println("cpf: ${pat.cpf}")
    println("salario: ${pat.salario}")
    println("bonificação: ${pat.bonificacao()}")

    val hugo = Diretor(
        nome = "hugo",
        cpf = "333.333.333-33",
        salario = 10000.0,
        senha = 100,
        plr = 100.0
    )

    println("-----------------------------")
    println("nome: ${hugo.nome}")
    println("cpf: ${hugo.cpf}")
    println("salario: ${hugo.salario}")
    println("senha: ${hugo.senha}")
    println("bonificação: ${hugo.bonificacao()}")
    println("plr: ${hugo.plr}")

    if (hugo.autentica(100)) {
        println("Sucesso na autenticação!")
    } else {
        println("Falha na autenticação!")
    }
}