class Calculadora(var operacao: String, var n1: Int, var n2: Int) {
    fun soma(n1: Int, n2: Int) = n1 + n2

    fun subtracao(n1: Int, n2: Int) = n1 - n2

    fun multplicacao(n1: Int, n2: Int) = n1 * n2

    fun divisao(n1: Int, n2: Int) = n1 / n2

    fun potencia(n1: Int) = n1 * n1

    fun raiz(n1: Int) = Math.sqrt(n1.toDouble())
}

fun main() {

    while(true) {
        println("Qual operação?\nSoma (+)\nSubtração (-)\nMultiplicação (*)\nDivisão (/)\nPotência (**)\nRaiz√ (v)\nSair (-1)")
        println("Obs: nas funções Raiz e Potência apenas o primeiro número será considerado.")
        print("Opção -> ")
        var operacao: String = readln()
        if (operacao.equals("-1")) {
            break
        }
        print("Qual o primeiro número? ")
        var numero1: Int = readln().toInt()
        print("Qual o segundo número? ")
        var numero2: Int = readln().toInt()

        var calculadora = Calculadora(operacao, numero1, numero2)

        when (operacao) {
            "+" -> println(calculadora.soma(numero1, numero2))
            "-" -> println(calculadora.subtracao(numero1, numero2))
            "*" -> println(calculadora.multplicacao(numero1, numero2))
            "/" -> println(calculadora.divisao(numero1, numero2))
            "**" -> println(calculadora.potencia(numero1))
            "v" -> println(calculadora.raiz(numero1))
            else -> println("Operação incorreta!")
        }

    }

}

