package aula4.lambdas

fun main(args: Array<String>) {
    var lista = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val funcao = { a: IntArray -> a.map { it + 1 } }
    println(percorrerLista(funcao, lista))
}

//2 - Como posso usar uma função de ordem superior para aplicar uma operação a cada
//elemento de uma lista em Kotlin?
fun percorrerLista(funcao: (IntArray) -> List<Int>, lista: IntArray): List<Int> {
    return funcao(lista)
}
