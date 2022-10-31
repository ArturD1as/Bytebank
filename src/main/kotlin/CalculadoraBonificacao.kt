class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun calcula(funcionario: Funcionario){
        this.total += funcionario.bonificacao()
    }
}