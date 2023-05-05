package aula4.lambdas

fun main(args: Array<String>) {
    var lista = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val operacao = {a: IntArray -> a.reduce { acumulador, elemento -> acumulador + elemento }}
    print(somar(lista, operacao))
}

//5 - Como posso usar uma função de ordem superior para somar todos os elementos de
//uma lista em Kotlin?
fun somar(lista: IntArray, operacao: (IntArray) -> Int): Int {
    return operacao(lista)
}