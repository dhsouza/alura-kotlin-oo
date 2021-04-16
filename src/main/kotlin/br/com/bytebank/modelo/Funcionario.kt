package br.com.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    abstract val bonificacao: Double

    override fun toString(): String {
        return "br.com.bytebank.modelo.Funcionario(nome='$nome', cpf='$cpf', salario=$salario, bonificacao=$bonificacao)"
    }

}