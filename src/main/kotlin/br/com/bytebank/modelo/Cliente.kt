package br.com.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

    override fun toString(): String {
        return "Cliente(nome='$nome', cpf='$cpf', endereco=$endereco, senha=$senha)"
    }

}