package br.com.bytebank.modelo

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

    override fun toString(): String {
        return "br.com.bytebank.modelo.FuncionarioAdmin(nome='$nome', cpf='$cpf', salario=$salario, bonificacao=$bonificacao)"
    }

}