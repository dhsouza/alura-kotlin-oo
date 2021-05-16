import br.com.bytebank.modelo.Endereco
import br.com.bytebank.teste.testaAny
import java.lang.ClassCastException
import java.lang.NumberFormatException

fun main() {
    println("início main")

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

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")

    try {
        funcao2()
    } catch (ex: ClassCastException) {
        ex.printStackTrace()
        println("ClassCastException thrown")
    }

    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

    for (i in 1..5) {
        println(i)
        val endereco = Any()
        endereco as Endereco
    }

    println("fim funcao2")
}
