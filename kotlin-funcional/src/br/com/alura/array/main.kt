package br.com.alura.array

fun main() {
    val idades = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("Maior idade: $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println("Menor idade: $menorIdade")
}