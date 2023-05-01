package aula3.atv2_funcoes_argumentos

fun main(args: Array<String>) {
    println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
}

//1 - Crie uma função que receba um número variável de argumentos do tipo Int. e
//retorne a soma dos mesmos

fun soma(vararg numeros: Int): Int {
    return numeros.reduce { acc, i -> acc + i }
}