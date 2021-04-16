package teste

import br.com.bytebank.modelo.Analista
import br.com.bytebank.modelo.CalculadoraBonificacao
import br.com.bytebank.modelo.Diretor
import br.com.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println(alex.toString())


    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println(fran.toString())

    if (fran.autentica(1234)) {
        println("Fran autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println(gui.toString())

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    println(maria)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")
}