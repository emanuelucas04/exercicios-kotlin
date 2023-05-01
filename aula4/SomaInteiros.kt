package aula4

fun main(args: Array<String>) {
    var lista = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(soma(lista, 0))
}

tailrec fun soma(lista: IntArray, indice: Int): Int {
    if (lista.size == indice) return 0

    return soma(lista, indice + 1) + lista[indice]
}