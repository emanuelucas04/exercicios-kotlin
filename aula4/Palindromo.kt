package aula4

fun main(args: Array<String>) {
    print("Informe uma string para verificar se é um palindromo: ")
    println(palindromo(readln()))
}

tailrec fun palindromo(palavra: String): Boolean {
    if (palavra.length <= 1) return true

    var primeiro: Char = palavra.get(0)
    var ultimo: Char = palavra.get(palavra.length - 1)

    if (primeiro == ultimo) {
        var meio: String = palavra.substring(1, palavra.length - 1)
        return palindromo(meio)
    } else return false
}