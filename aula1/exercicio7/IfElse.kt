package exercicio7

fun main(args: Array<String>) {

    var nota1: Double = readln().toDouble()
    var nota2: Double = readln().toDouble()
    estaAprovado(nota1, nota2)

    var numero1: Int = readln().toInt()
    ehParOuImpar(numero1)

    var numero2: Int = readln().toInt()
    ehPositivoNegativoOuZero(numero2)

    var idade: Int = readln().toInt()
    ehMaiorDeIdade(idade)
}

// a)
fun estaAprovado(n1: Double, n2: Double) {
    var media: Double = ((n1 + n2) / 2)
    if (media >= 7) {
         println("Aprovado")
    } else {
        println("Reprovado")
    }
}

// b)
fun ehParOuImpar(n1: Int) {
     if (n1 % 2 == 0) {
         println("É par")
     } else {
         println("É ímpar")
     }
}

// c)
fun ehPositivoNegativoOuZero(n1: Int) {
    if (n1 < 0) {
        println("O número ${n1} é negativo")
    } else if (n1 > 1){
        println("O número ${n1} é positivo")
    } else {
        println("O número ${n1} é igual a 0.")
    }
}

// d)
fun ehMaiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("O usuário tem ${idade} e é maior de idade")
    } else {
        println("O usuário tem ${idade} e é menor de idade")
    }
}