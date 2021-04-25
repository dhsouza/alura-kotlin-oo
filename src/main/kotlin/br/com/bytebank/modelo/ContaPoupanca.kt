package br.com.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Tá pobre bixo")
        }
    }

    override fun toString(): String {
        return "br.com.bytebank.modelo.ContaPoupanca() ${super.toString()}"
    }
}
