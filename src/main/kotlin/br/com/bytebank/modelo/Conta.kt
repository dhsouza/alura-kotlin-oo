package br.com.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        println("Depositando na conta do $titular")
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        } else {
            return false
        }
    }

    override fun toString(): String {
        return "Conta(titular=$titular, numeroConta=$numeroConta, saldo=$saldo)"
    }

}