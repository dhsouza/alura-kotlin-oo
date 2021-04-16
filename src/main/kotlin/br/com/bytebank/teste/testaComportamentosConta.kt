package br.com.bytebank.teste

import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val contaAlex = ContaCorrente(titular = "Alex", numeroConta = 1000)
    contaAlex.deposita(200.0)
    println(contaAlex)

    contaAlex.deposita(100.0)
    println(contaAlex)

    val contaFran = ContaPoupanca("Fran", 1001)
    contaFran.deposita(300.0)
    contaFran.saca(200.0)

    contaAlex.transfere(50.0, contaFran)

    println(contaAlex)
    println(contaFran)
}