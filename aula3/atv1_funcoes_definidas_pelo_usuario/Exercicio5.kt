package aula3.atv1_funcoes_definidas_pelo_usuario

fun main(args: Array<String>) {
    var lista = ArrayList<String>()
    for (i in 0..9) {
        print("Digite uma string para a posição $i do array: ")
        lista.add(readln())
    }

    println("Lista anterior: ${lista.toArray().contentToString()}")
    println("Lista filtrada: ${listarStringsComMaisDeCincoCaracteres(lista).toArray().contentToString()}")
}

//5 - Crie uma função que receba um array de strings como argumento e retorne uma
//nova lista contendo apenas as strings que possuem mais de 5 caracteres.
fun listarStringsComMaisDeCincoCaracteres(lista: ArrayList<String>): ArrayList<String> {
    var listaFiltrada = ArrayList<String>()
    for (i in 0..lista.size - 1) {
        if (lista[i].length >= 5) listaFiltrada.add(lista[i])
    }
    return listaFiltrada
}