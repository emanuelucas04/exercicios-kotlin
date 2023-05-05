package aula4.lambdas

fun main(args: Array<String>) {
    val operacao = {x: Int, y: Int -> x + y}
    println(somar(77, 33, operacao))
}

// 6 - Como posso usar uma função de ordem superior para criar uma função que retorna
//a soma de dois números em Kotlin?
fun somar(n1: Int, n2: Int, operacao: (Int, Int) -> Int): Int {
    return (operacao(n1, n2))
}
