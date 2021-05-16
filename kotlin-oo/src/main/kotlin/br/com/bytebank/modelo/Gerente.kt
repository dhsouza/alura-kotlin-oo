package br.com.bytebank.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario
        }

    override fun toString(): String {
        return "br.com.bytebank.modelo.Gerente(senha=$senha) ${super.toString()}"
    }

}