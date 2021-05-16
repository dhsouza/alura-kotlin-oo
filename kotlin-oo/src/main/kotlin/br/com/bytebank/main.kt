import br.com.bytebank.exceptions.SaldoInsuficienteException
import br.com.bytebank.modelo.Endereco
import br.com.bytebank.teste.testaComportamentosConta
import java.lang.ClassCastException
import java.lang.Exception

fun main() {
    val enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "teste")

    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento.length ?: 0
        println(tamanhoComplemento)
    }

    teste("")
    teste(1)
}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}

