package br.com.bytebank.teste

import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca
import br.com.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    val alex = Cliente(
        nome = "Alex",
        cpf = "",
        senha = 1,
        endereco = Endereco(
            logradouro = "Rua Vergueiro"
        )
    )
    val contaCorrente = ContaCorrente(
        titular = alex,
        numeroConta = 1000
    )

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)
    val contaPoupanca = ContaPoupanca(
        titular = fran,
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

    contaCorrente.transfere(100.0, contaPoupanca, 1)

    println(contaCorrente)
    println(contaPoupanca)


    contaPoupanca.transfere(50.0, contaCorrente, 2)

    println(contaCorrente)
    println(contaPoupanca)
}