package br.com.bytebank.teste

fun testaLacos() {
    var i = 0

    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0
        saldo = i + 10.0


        println("titular $titular")
        println("numeroConta $numeroConta")
        println("saldo $saldo")

        println(i)
        i++
    }

    for (i in 5 downTo 1) {

        if (i == 4) {
            continue
        }

        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0
        saldo = i + 10.0


        println("titular $titular")
        println("numeroConta $numeroConta")
        println("saldo $saldo")


        println(i)
    }
}
