package aula3.atv1_funcoes_definidas_pelo_usuario

fun main(args: Array<String>) {
    var lista = IntArray(10)
    for (i in 0..9) {
        lista[i] = ((1..40).random())
    }
    println("O maior número da lista: ${lista.contentToString()} é ${maiorValor(lista)}")
}

// 4 - Crie uma função que receba um array de números inteiros como argumento e
//retorne o maior valor presente no array.
fun maiorValor(lista: IntArray): Int {
    var maior: Int = 0
    for (i in 0..lista.size - 1) {
        if (lista[i] > maior) maior = lista[i]
    }
    return maior
}