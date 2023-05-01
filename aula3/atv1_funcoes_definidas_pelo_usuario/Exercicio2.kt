package aula3.atv1_funcoes_definidas_pelo_usuario

fun main(args: Array<String>) {
    print("Informe um número para verificar se é par ou não: ")
    var num: Int = readln().toInt()
    if (ehPar(num)) println("O número $num ${ehPar(num)} => é par")
    else println("O número $num ${ehPar(num)} => é ímpar")
}

//2 - Crie uma função que receba um número inteiro como argumento e retorne
//verdadeiro se o mesmo for par e falso caso contrário.
fun ehPar(num: Int): Boolean {
    return num % 2 == 0
}