package exercicio5

fun main(args: Array<String>) {

    // 1)
    print("Digite o primeiro numero: ")
    var numero1: Int = readln().toInt()
    print("Digite o segundo numero: ")
    var numero2: Int = readln().toInt()
    var resultadoSoma: Int = soma(numero1, numero2)
    println(resultadoSoma)

    // 2)
    print("Digite um número para calcular o quadrado: ")
    var numero: Int = readln().toInt()
    var resultadoPotencia: Int = calculaQuadrado(numero)
    println(resultadoPotencia)

    // 3)
    print("Informe seu nome: ")
    var nome: String = readln()
    print("Informe sua idade: ")
    var idade: Int = readln().toInt()
    var saudacao: String = saudacao(nome, idade)
    println(saudacao)
}

// 1)
fun soma(n1: Int, n2: Int): Int {
    return n1 + n2
}

// 2)
fun calculaQuadrado(n1: Int): Int {
    return n1 * n1
}

// 3)
fun saudacao(texto: String, idade: Int): String {
    return "Olá, seja bem-vindo ${texto}, ${idade}"
}