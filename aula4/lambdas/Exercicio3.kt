package aula4.lambdas

// 3 - Como posso usar uma função lambda para filtrar elementos de uma lista em Kotlin?
fun main(args: Array<String>) {
    var lista = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var listaFiltrada = lista.filter {
        it % 2 == 0
    }
    print(listaFiltrada)
}

