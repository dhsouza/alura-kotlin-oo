import br.com.bytebank.exceptions.SaldoInsuficienteException
import br.com.bytebank.modelo.Endereco
import br.com.bytebank.teste.testaComportamentosConta
import java.lang.ClassCastException
import java.lang.Exception

fun main() {

    var enderecoNulo: Endereco? = null
    var enderecoNaoNulo: Endereco = enderecoNulo!!

    enderecoNaoNulo.complemento = ""


}

