package br.com.alura.array.teste

fun main() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    println("Menor idade: ${idades.maxOrNull()}")
    println("Maior idade: ${idades.minOrNull()}")
    println("Média das idades: ${idades.average()}")
    println("Todos maiores de idade? ${idades.all { it >= 18 }}")
    println("Algum aluno é maior de idade? ${idades.any { it >= 18 }}")
    println("Maiores de idade: ${idades.filter { it >= 18 }}")
    println("Busca: ${idades.find { it > 18 }}")
}