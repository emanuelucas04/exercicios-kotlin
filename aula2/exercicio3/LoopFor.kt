package aula2.exercicio3

fun main() {
    // 1 - Faça um loop for que imprima todos os números de 1 a 10:
    for (num: Int in 1..10) {
        println(num)
    }

    // 2 - Faça um loop for que imprima todos os números pares de 0 a 20:
    for (num: Int in 0..20) {
        if (num % 2 == 0) {
            println(num)
        }
    }

    // 3 - Faça um loop for que imprima todos os números ímpares de 10 a 0:
    for (num: Int in 10 downTo 0) {
        if (num % 2 != 0) {
            println(num)
        }
    }

}