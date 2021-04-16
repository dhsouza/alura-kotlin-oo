package br.com.bytebank.modelo

class ContaCorrente(
    titular: String,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        } else {
            println("Tá pobre bixo")
        }
    }

    override fun toString(): String {
        return "br.com.bytebank.modelo.ContaCorrente() ${super.toString()}"
    }

}
