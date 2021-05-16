package br.com.bytebank.modelo

import br.com.bytebank.exceptions.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int
) {
    var saldo = 0.0
        protected set

    companion object {
        var totalContas = 0
            private set
    }

    init {
        println("Criando conta ${titular.nome}")
        totalContas++
        println("Total de contas criadas: $totalContas")
    }

    fun deposita(valor: Double) {
        println("Depositando na conta do $titular")
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta) {
        if (saldo < valor) {
            throw SaldoInsuficienteException()
        }

        saldo -= valor
        destino.deposita(valor)
    }

    override fun toString(): String {
        return "Conta(titular=$titular, numeroConta=$numeroConta, saldo=$saldo)"
    }

}