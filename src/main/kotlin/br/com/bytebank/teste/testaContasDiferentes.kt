package br.com.bytebank.teste

import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numeroConta = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numeroConta = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println(contaCorrente)
    println(contaPoupanca)

    contaCorrente.saca(200.0)
    contaPoupanca.saca(500.0)

    println(contaCorrente)
    println(contaPoupanca)

    contaCorrente.transfere(100.0, contaPoupanca)

    println(contaCorrente)
    println(contaPoupanca)


    contaPoupanca.transfere(50.0, contaCorrente)

    println(contaCorrente)
    println(contaPoupanca)
}