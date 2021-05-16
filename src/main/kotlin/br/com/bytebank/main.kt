import br.com.bytebank.exceptions.SaldoInsuficienteException
import br.com.bytebank.modelo.Endereco
import br.com.bytebank.teste.testaComportamentosConta
import java.lang.ClassCastException
import java.lang.Exception

fun main() {
    val enderecoNulo: Endereco? = Endereco(complemento = "teste")

    enderecoNulo?.let {
        println(it.complemento)
    }

}

