open class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {
    open fun bonificacao(): Double = this.salario * 0.1


}