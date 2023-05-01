package aula3.atv2_funcoes_argumentos

fun main(args: Array<String>) {

    var lista = ArrayList<String>()
    for (i in 0..4) {
        print("Digite uma string para posição $i: ")
        lista.add(readln())
    }
    print("Digite um caractere para verificar se a primeira letra está contida em alguma string da lista: ")
    var caractere: Char = readln().get(0)

    println("Lista anterior: ${lista.toArray().contentToString()}")
    println("Lista filtrada: ${novaLista(lista, caractere).toArray().contentToString()}")

}

//4 - Crie uma função que receba um array de strings e um caractere como argumentos e
//retorne uma nova lista contendo apenas as strings que começam com o caractere
//informado.
fun novaLista(lista: ArrayList<String>, caractere: Char): ArrayList<String> {
    var listaFiltrada = ArrayList<String>()
    for (i in 0..lista.size - 1) {
        if (lista[i][0] == caractere) listaFiltrada.add(lista[i])
    }
    return listaFiltrada
}