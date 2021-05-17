package br.com.alura.array.teste

fun main() {
    val serie: IntRange = 1.rangeTo(10)

    for (s in serie) {
        print("$s ")
    }

    println()

    val numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    println()

    val numerosParesUntil = 0.until(100) step 2
    for (numeroPar in numerosParesUntil) {
        print("$numeroPar ")
    }

    println()

    val numerosParesReversos = 100 downTo 2 step 2
    for (numeroPar in numerosParesReversos) {
        print("$numeroPar ")
    }

    println()

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não stá dentro do intervalo")
    }

    val alfabetoMinusculo = "a".."z"
    val letra = "m"
    println(letra in alfabetoMinusculo)
}
