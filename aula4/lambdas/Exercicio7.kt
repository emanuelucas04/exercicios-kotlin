package aula4.lambdas

fun main(args: Array<String>) {
    imprimir("Milan vai ser campeão esse ano", 8)
}

//7 - Como posso usar uma função de ordem superior para imprimir uma mensagem n
//vezes em Kotlin?

fun imprimir(msg: String, n: Int) {
    repeat(n) {
        println(msg)
    }
}