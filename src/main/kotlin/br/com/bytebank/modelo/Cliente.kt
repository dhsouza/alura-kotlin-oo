package br.com.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

    override fun toString(): String {
        return "Cliente(nome='$nome', cpf='$cpf', senha=$senha)"
    }

}