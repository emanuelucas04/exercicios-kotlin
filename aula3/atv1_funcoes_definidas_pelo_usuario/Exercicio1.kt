package aula3.atv1_funcoes_definidas_pelo_usuario

fun main (args: Array<String>) {
    print("Informe o primeiro número: ")
    var num1: Int = readln().toInt()
    print("Informe o segundo número: ")
    var num2: Int = readln().toInt()

    print("Soma de $num1 + $num2 é ${soma(num1, num2)} ")
}

//1 - Crie uma função que receba dois números inteiros como argumentos e retorne a
//soma dos mesmos.
fun soma(n1: Int, n2: Int) = n1 + n2
