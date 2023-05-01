package aula2.exercicio4

fun main() {

    // 1 - Crie um range de números de 1 a 10 e imprima cada número:
    for (i in 1..10) {
        println(i)
    }

    // 2 - Crie um range de letras de 'a' a 'z' e imprima cada letra:
    for (i in 'a'..'z') {
        println(i)
    }

    // 3 - Crie um range de números de 1 a 100 e imprima apenas os números pares:
    for (i in 1..100) {
        if (i % 2 == 0) println(i)
    }
}