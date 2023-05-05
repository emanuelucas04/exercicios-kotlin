package aula4.lambdas

//4 - Como posso usar uma função lambda para encontrar o maior valor em uma lista em
//Kotlin?
fun main(args: Array<String>) {
    var lista = intArrayOf(68765, 353, 32, 234, 798495, 2342, 12321, 32, 42, 545, 43341, 1231)
    var maiorValor = lista.maxByOrNull { it }
    print(maiorValor)
}