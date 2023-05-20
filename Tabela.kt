import java.io.File
import java.io.FileReader
import java.io.FileWriter

fun main() {
    val file = File("times.csv")

    while (true) {
        println("Selecione a operação desejada:")
        println("1 - Criar tabela")
        println("2 - Ler tabela")
        println("3 - Editar tabela")
        println("4 - Adicionar linha à tabela")
        println("5 - Deletar linha da tabela")
        println("6 - Deletar tabela")
        println("7 - Sair")

        val opcao = readLine()?.toIntOrNull() ?: continue //verifica se o usuário escreveu alguma coisa, se não tiver escrito o menu é chamado novamente

        when (opcao) {
            1 -> criarTabela(file)
            2 -> lerTabela(file)
            3 -> editarTabela(file)
            4 -> adicionarLinha(file)
            5 -> deletarLinha(file)
            6 -> deletarTabela(file)
            7 -> return
            else -> println("Opção inválida")
        }
    }
}

fun criarTabela(file: File) {
    val writer = FileWriter(file)

    writer.write("Colocacao,Nome,UCL,Vices\n")
    writer.write("1,Real-Madrid-ESP,14,3\n")
    writer.write("2,Milan-ITA,7,4\n")
    writer.write("3,Bayern-Munchen-DEU,6,5\n")
    writer.write("4,Liverpool-ENG,6,4\n")
    writer.write("5,Barcelona-ESP,5,5\n")
    writer.write("6,Ajax-NLD,4,2\n")
    writer.write("7,Manchester-United-ENG,3,2\n")
    writer.write("8,Internazionale-ITA,3,2\n")
    writer.write("9,Chelsea-ENG,2,1\n")
    writer.write("10,Juventus-ITA,2,7\n")

    writer.close()

    println("Tabela criada com sucesso")
}

fun editarTabela(file: File) {
    val reader = FileReader(file)

    val lines = reader.readLines().toMutableList()
    reader.close()

    println("Digite o nome do time que deseja editar:")
    val nome = readLine() ?: return

    var index = -1
    for ((i, line) in lines.withIndex()) {
        val fields = line.split(",")
        if (fields[1] == nome) {
            index = i
            break
        }
    }

    if (index == -1) {
        println("time não encontrado")
        return
    }

    println("Digite a quantidade de vezes que o time foi campeão:")
    val quantidadeCampeao = readLine() ?: return

    println("Digite a quantidade de vezes que o time foi vice:")
    val quantidadeVice = readLine() ?: return

    val fields = lines[index].split(",").toMutableList()
    fields[2] = quantidadeCampeao
    lines[index] = fields.joinToString(",")
    fields[3] = quantidadeVice
    lines[index] = fields.joinToString(",")

    val writer = FileWriter(file)

    writer.write(lines.joinToString("\n"))

    writer.close()

    println("Time editado com sucesso")
}

fun deletarLinha(file: File) {
    val reader = FileReader(file)

    val lines = reader.readLines().toMutableList()
    reader.close()

    println("Digite o nome do Time que deseja deletar:")
    val nome = readLine() ?: return

    var index = -1
    for ((i, line) in lines.withIndex()) {
        val fields = line.split(",")
        if (fields[1] == nome) {
            index = i
            break
        }
    }

    if (index == -1) {
        println("Time não encontrado")
        return
    }

    lines.removeAt(index)

    val writer = FileWriter(file)

    writer.write(lines.joinToString("\n"))

    writer.close()

    println("Time deletado com sucesso")
}

fun adicionarLinha(file: File) {
    val reader = FileReader(file)

    val lines = reader.readLines().toMutableList()
    reader.close()

    println("Digite a colocacao do novo Time:")
    val colocacao = readLine() ?: return

    println("Digite o nome do novo Time:")
    val nome = readLine() ?: return

    println("Digite a quantidade de vezes que o time foi campeao:")
    val quantidadeVezesCampeao = readLine() ?: return

    println("Digite a quantidade de vezes que o time foi vice:")
    val quantidadeVezesVice = readLine() ?: return

    val novaLinha = "$colocacao,$nome,$quantidadeVezesCampeao,$quantidadeVezesVice"
    lines.add(novaLinha)

    val writer = FileWriter(file)

    writer.write(lines.joinToString("\n"))

    writer.close()

    println("Time adicionado com sucesso")
}

fun lerTabela(file: File) {
    val reader = FileReader(file)

    val lines = reader.readLines()
    reader.close()

    if (lines.isEmpty()) {
        println("A tabela está vazia")
        return
    }

    for (line in lines) {
        val fields = line.split(",")
        val colocacao = fields[0]
        val nome = fields[1]
        val quantidadeVezesCampeao = fields[2]
        val quantidadeVezesVice = fields[3]
        println("$colocacao\t| $nome\t| $quantidadeVezesCampeao\t| $quantidadeVezesVice")
    }
}

fun deletarTabela(file: File) {
    if (file.exists()) {
        file.delete()
        println("Tabela deletada com sucesso")
    } else {
        println("Tabela não encontrada")
    }
}