import br.com.bytebank.modelo.Endereco
import br.com.bytebank.teste.testaAny
import java.lang.ClassCastException

fun main() {
    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    try {
        for (i in 1..5){
            println(i)
            val endereco = Any()
            endereco as Endereco
        }
    } catch (ex: ClassCastException) {
        println("ClassCastException thrown")
    }

    println("fim funcao2")
}
