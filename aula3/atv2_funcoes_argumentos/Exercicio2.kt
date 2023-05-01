package aula3.atv2_funcoes_argumentos

fun main(args: Array<String>) {
    var lista = ArrayList<Int>()
    for (i in 1..20) {
        lista.add((1..50).random())
    }
    print("Informe um valor para N: ")
    var n: Int = readln().toInt()
    println("Lista anterior: ${lista.toArray().contentToString()}")
    println("Lista filtrada: ${maiorQueN(lista, n).toArray().contentToString()}")
}

//2 - Crie uma função que receba um array de números inteiros e um número inteiro n
//como argumentos e retorne uma nova lista contendo apenas os elementos do array
//que são maiores do que n
fun maiorQueN(lista: ArrayList<Int>, n: Int): ArrayList<Int> {
    var novaLista = ArrayList<Int>()
    for (i in lista) {
        if (i > n) novaLista.add(i)
    }
    return novaLista
}