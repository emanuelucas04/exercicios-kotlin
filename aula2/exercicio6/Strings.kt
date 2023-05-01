package aula2.exercicio6

fun main() {

    // 1 - Escreva um programa que leia uma frase do usuário e imprima quantos caracteres
    //ela possui usando length.
    print("Digite uma frase para que seja exibida o tamanho dela: ")
    var frase: String = readln()
    println(frase.length)

    // 2 - Escreva um programa que leia uma frase do usuário e imprima a mesma frase em
    //ordem inversa usando loop for.
    print("Digite uma frase para que seja exibida na ordem inversa: ")
    frase = readln()
    var fraseInvertida: String = ""
    for (i: Int in frase.length - 1 downTo 0) {
        fraseInvertida += frase[i]
    }
    println(fraseInvertida)

    // 3 - Escreva um programa que leia uma frase do usuário e imprima apenas as vogais da
    //frase usando loop for e if.
    print("Digite uma frase para que seja exibida as vogais: ")
    frase = readln()
    for (i in frase) {
        if ("AaEeIiOoUu".contains(i)) {
            println(i)
        }
    }
}