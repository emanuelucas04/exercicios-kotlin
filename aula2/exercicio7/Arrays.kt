package aula2.exercicio7

fun main() {

    // 1 - Escreva um programa que crie um array de 10 números inteiros aleatórios e
    //imprima o maior número do array.
    var arrayDeInteirosAleatorios = IntArray(10)
    var maior: Int = 0
    for (i in 0..arrayDeInteirosAleatorios.size - 1) {
        arrayDeInteirosAleatorios[i] = (1..100).random()
        if (arrayDeInteirosAleatorios[i] > maior) {
            maior = arrayDeInteirosAleatorios[i]
        }
    }
    println(arrayDeInteirosAleatorios.contentToString())
    println(maior)


    // 2 - Escreva um programa que crie um array de 10 números inteiros digitados pelo
    //usuário e imprima a média dos números do array.
    var arrayDeInteiros = IntArray(10)
    var soma: Int = 0
    for (i in 0..arrayDeInteiros.size - 1) {
        print("Digite um número para posição $i do array: ")
        arrayDeInteiros[i] = readln().toInt()
        soma += arrayDeInteiros[i]
    }

    var media: Double = soma.toDouble() / arrayDeInteiros.size
    println(arrayDeInteiros.contentToString())
    println(media)

    // 3 - Escreva um programa que crie um array de 10 strings com nomes de frutas e
    //imprima somente as frutas que começam com a letra "a" usando loop for e if.
    var frutas = Array(10) {
            i -> readln()
    }
    println(frutas.contentToString())

    frutas.forEach {
        fruta -> if ("aA".contains(fruta[0])) {
            println(fruta)
        }
    }

}