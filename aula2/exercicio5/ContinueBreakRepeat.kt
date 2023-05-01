
fun main() {

    // 1 - Escreva um programa que imprima todos os números de 0 a 10, exceto o número 5,
    //usando continue.
    for (i in 0..10) {
        if (i == 5) {
            continue
        }
        println(i)
    }

    // 2 - Escreva um programa que leia números do usuário e pare quando o número
    //digitado for negativo usando break.
    var numEntrada: Int
    while (true) {
        print("Digite um número: ")
        numEntrada = readln().toInt()
        if (numEntrada < 0) {
            break
        }
    }

    // 3 - Escreva um programa que leia um número inteiro positivo do usuário e imprima
    //todos os números pares de 0 até o número digitado, exceto o número 4, usando
    //continue e break.
    var num: Int = readln().toInt();
    var it: Int = 0
    while (true) {
        if (it < num) {
            it++
        } else {
            break
        }
        if (it == 4) {
            continue
        }
        if (it % 2 == 0) {
            println(it)
        }
    }
}