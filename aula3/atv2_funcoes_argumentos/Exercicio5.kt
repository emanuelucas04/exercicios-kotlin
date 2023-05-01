package aula3.atv2_funcoes_argumentos

fun main(args: Array<String>) {
    var lista = ArrayList<Int>()

    repeat(10) {
        lista.add((1..100).random())
    }

    print("Digite um número para N: ")
    var n: Int = readln().toInt()
    println("Lista anterior: ${lista.toArray().contentToString()}")
    println("Lista filtrada: ${novaLista(lista, n).toArray().contentToString()}")
}

//5 - Crie uma função que receba um array de números inteiros e um número inteiro n
//como argumentos e retorne uma nova lista contendo apenas os elementos do array
//que estão nas posições múltiplas de n.
fun novaLista(lista: ArrayList<Int>, n: Int): ArrayList<Int> {
    var listaFiltrada = ArrayList<Int>()
    for (i in 0..lista.size - 1) {
        if (i != 0 && i % n == 0) listaFiltrada.add(lista[i])
    }
    return listaFiltrada
}