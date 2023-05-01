package aula3.atv2_funcoes_argumentos

fun main(args: Array<String>) {
    var lista = ArrayList<Int>()
    repeat(10) {
        lista.add((1..100).random())
    }
    println("Lista anterior: ${lista.toArray().contentToString()}")
    println("Lista atual: ${(transforma({it}, lista))}")

}

// 3 - Crie uma função que receba uma função de transformação como argumento, um
//array de números inteiros e retorne uma nova lista contendo os elementos do array
//transformados pela função de transformação.

fun transforma(transformFunction: (Int) -> Int, lista: ArrayList<Int>): List<Int> {
    return lista.map { transformFunction(it) }
}