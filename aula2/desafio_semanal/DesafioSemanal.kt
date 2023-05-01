package aula2.desafio_semanal

class Pessoa(var nome: String, var idade: Int) {

    fun exibirAtributos(): String {
        return "Nome: ${this.nome}\nIdade: ${this.idade}\n"
    }
}

fun main() {
    var pessoas = ArrayList<Pessoa>()
    var run = true
    while (run) {
        menu()
        print("Opção: ")
        var opcao = readln().toInt()
        println()
        when (opcao) {
            1 -> adicionarPessoa(pessoas)
            2 -> listarPessoas(pessoas)
            3 -> exibirMediaDaIdade(pessoas)
            4 -> buscarPessoa(pessoas)
            5 -> {
                pessoas = removerPessoa(pessoas)
                if (!pessoas.isEmpty()) listarPessoas(pessoas)
            }
            6 -> run = false
            else -> println("Opção inválida!")
        }
    }
}

//1 - Permitir ao usuário adicionar uma nova pessoa ao array, informando o nome e a
//idade.

fun adicionarPessoa(pessoas: ArrayList<Pessoa>) {
    print("Informe o nome da pessoa: ")
    var nome: String = readln().trim()
    print("Informe a idade da pessoa: ")
    var idade: Int = readln().toInt()
    var pessoa = Pessoa(nome, idade)
    pessoas.add(pessoa)
    println("\nPessoa nova adicionada na lista!\n")
}

//2 - Exibir a lista de todas as pessoas adicionadas ao array, mostrando o nome e a
//idade de cada uma.

fun listarPessoas(pessoas: ArrayList<Pessoa>) {
    if (pessoas.isEmpty()) {
        println("A lista está vazia!")
        return
    }
    println("Pessoas cadastradas na lista: ")
    pessoas.forEach{ pessoa -> println(pessoa.exibirAtributos()) }
}

//3 - Exibir a média de idade das pessoas adicionadas ao array.

fun exibirMediaDaIdade(pessoas: ArrayList<Pessoa>) {
    if (pessoas.isEmpty()) {
        println("\nA lista está vazia!\n")
        return
    }
    var soma: Int = 0
    pessoas.forEach { pessoa -> soma += pessoa.idade }

    var media = soma / pessoas.size
    println("A média das idades é: ${media}\n")
}

//4 - Permitir ao usuário buscar uma pessoa pelo nome, exibindo o nome e a idade
//correspondentes.

fun buscarPessoa(pessoas: ArrayList<Pessoa>) {
    if (pessoas.isEmpty()) {
        println("A lista está vazia!\n")
        return
    }
    print("Informe o nome da pessoa a ser buscada: ")
    var nome: String = readln().trim()
    pessoas.forEach {
        pessoa -> if (pessoa.nome.equals(nome)) {
            println(pessoa.exibirAtributos())
        }
    }
}

//5 - Permitir ao usuário remover uma pessoa pelo nome, atualizando o array e exibindo
//a lista atualizada.

fun removerPessoa(pessoas: ArrayList<Pessoa>): ArrayList<Pessoa> {
    if (pessoas.isEmpty()) {
        println("A lista está vazia!\n")
        return pessoas
    }
    print("Informe o nome da pessoa a ser removida: ")
    var nome: String = readln().trim()
    pessoas.removeIf {
        pessoa -> pessoa.nome.equals(nome)
    }
    println("\nPessoa removida!\n")
    return pessoas
}

fun menu() {
    println("Menu:")
    println("1 - Adicionar pessoa")
    println("2 - Listar pessoas")
    println("3 - Exibir média das idades")
    println("4 - Buscar uma pessoa específica")
    println("5 - Remover uma pessoa")
    println("6 - Sair")
}