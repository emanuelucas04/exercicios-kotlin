package aula4

fun main(args: Array<String>) {
    print("Informe um número para ser calculado o fatorial dele: ")
    var num: Int = readln().toInt()
    for (i in 0..num) {
        println(fatorial(i))
    }
}

// 1 - Crie uma função recursiva que calcule o fatorial de um número inteiro positivo.
tailrec fun fatorial(n: Int): Int {
    if (n == 0) return 1

    return fatorial(n - 1) * n
}