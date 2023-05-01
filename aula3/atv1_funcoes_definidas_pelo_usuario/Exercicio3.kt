package aula3.atv1_funcoes_definidas_pelo_usuario

fun main(args: Array<String>) {
    print("Informe uma string qualquer para verificar se é um palíndromo: ")
    var string: String = readln()

    if (ehUmPalindromo(string)) println("A string ${string} é um palíndromo")
    else println("A string ${string} não é um palíndromo")
}

//3 - Crie uma função que receba uma string como argumento e retorne verdadeiro se a
//mesma for palíndromo (ou seja, lida da esquerda para direita é igual a lida da direita
//para esquerda) e falso caso contrário.
fun ehUmPalindromo(palavra: String): Boolean {
    var inverso: String = ""
    for (i in 0..palavra.length - 1) {
        inverso += palavra[i]
    }
    println(inverso)
    return inverso.equals(palavra)
}