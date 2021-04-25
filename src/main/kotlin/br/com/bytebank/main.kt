import br.com.bytebank.teste.testaAutenticacao
import br.com.bytebank.teste.testaComportamentosConta
import br.com.bytebank.teste.testaCondicoes
import br.com.bytebank.teste.testaContasDiferentes
import teste.testaFuncionarios

fun main() {
    testaAutenticacao()
    testaComportamentosConta()
    testaContasDiferentes()
    testaCondicoes(200.00)
    testaFuncionarios()
}
