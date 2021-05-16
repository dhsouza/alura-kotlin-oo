package br.com.bytebank.teste

import java.lang.NumberFormatException

fun testaExpressao() {
    val entrada: String = "1"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (ex: NumberFormatException) {
        println("Problema na conversão")
        ex.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }
}