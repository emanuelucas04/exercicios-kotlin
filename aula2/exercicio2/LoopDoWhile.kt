package aula2.exercicio2

fun main() {
    // 1) Faça um loop do-while que imprima todos os números de 1 a 10:
    var num: Int = 1
    do {
        println(num)
        num++
    } while (num <= 10)

    // 2) Faça um loop do-while que peça ao usuário para digitar um número até que ele
    //digite um número negativo:

    var numEntrada: Int
    do {
        print("Digite um número: ")
        numEntrada = readln().toInt()
    } while (numEntrada > 0)

    // 3) Faça um loop do-while que peça ao usuário para digitar um número de 1 a 10 até
    //que ele acerte o número sorteado:

    var numAleatorio: Int = (1..10).random()
    var numEntrada2: Int
    do {
        print("Digite um número de 1..10: ")
        numEntrada2 = readln().toInt()
    } while (numEntrada2 != numAleatorio)
}