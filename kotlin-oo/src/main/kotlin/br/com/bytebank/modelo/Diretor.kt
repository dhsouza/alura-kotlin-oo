package br.com.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario + plr
        }

    override fun toString(): String {
        return "br.com.bytebank.modelo.Diretor(senha=$senha, plr=$plr) ${super.toString()}"
    }

}