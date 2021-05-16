import br.com.bytebank.exceptions.SaldoInsuficienteException
import br.com.bytebank.modelo.Endereco
import br.com.bytebank.teste.testaComportamentosConta
import java.lang.ClassCastException
import java.lang.Exception

fun main() {
    /*println("início main")
    funcao1()
    println("fim main")*/
    testaComportamentosConta()
}

fun funcao1() {
    println("início funcao1")

    try {
        funcao2()
    } catch (ex: SaldoInsuficienteException) {
        ex.printStackTrace()
        println("SaldoInsuficienteException thrown")
    }

    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }

    println("fim funcao2")
}
