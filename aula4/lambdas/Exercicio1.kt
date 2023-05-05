package aula4.lambdas

//1 - Como posso usar uma função lambda para classificar uma lista em ordem crescente
//em Kotlin?
fun main(args: Array<String>) {
    var lista = intArrayOf(4, 3, 6, 7, 54, 2, 66, 643, 21, 98, 65)
    var listaOrdenada = lista.sortedWith {a, b -> a.compareTo(b)}
    print(listaOrdenada)
}