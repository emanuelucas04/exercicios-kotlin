package desafio_semanal

fun main() {
    print("Qual tipo de unidade você deseja converter? ")
    print("(1 - Temperatura, ")
    print("2 - Distância, ")
    print("3 - Tempo) -> ")
    val opcao = readln().toInt()

    when (opcao) {
        1 -> {
            print("Qual é a unidade de origem? ")
            print("(1 - Celsius, ")
            print("2 - Fahrenheit) -> ")
            val unidadeOrigem = readln().toInt()

            print("Qual é a unidade de destino? ")
            print("(1 - Celsius, ")
            print("2 - Fahrenheit) -> ")
            val unidadeDestino = readln().toInt()

            print("Digite a temperatura: ")
            val temperatura = readln().toDouble()

            var resultado = 0.0
            var unidade = ""
            if (unidadeOrigem == 1 && unidadeDestino == 2) {
                resultado = temperatura * 9/5 + 32
                unidade = "°F"
            } else if (unidadeOrigem == 2 && unidadeDestino == 1) {
                resultado = (temperatura - 32) * 5/9
                unidade = "°C"
            } else {
                println("Opção inválida!")
                return
            }

            println("Resultado: $resultado$unidade")
        }

        2 -> {
            print("Qual é a unidade de origem? ")
            print("(1 - Metro, ")
            print("2 - Quilômetro) -> ")
            val unidadeOrigem = readln().toInt()

            print("Qual é a unidade de destino? ")
            print("(1 - Metro, ")
            print("2 - Quilômetro) -> ")
            val unidadeDestino = readln().toInt()

            print("Digite a distância: ")
            val distancia = readln().toDouble()

            var resultado = 0.0
            var unidade = ""
            if (unidadeOrigem == 1 && unidadeDestino == 2) {
                resultado = distancia / 1000
                unidade = "km"
            } else if (unidadeOrigem == 2 && unidadeDestino == 1) {
                resultado = distancia * 1000
                unidade = "cm"
            } else {
                println("Opção inválida!")
                return
            }

            println("Resultado: $resultado $unidade")
        }

        3 -> {
            print("Qual é a unidade de origem? ")
            print("(1 - Hora, ")
            print("2 - Minuto) -> ")
            val unidadeOrigem = readln().toInt()

            print("Qual é a unidade de destino? ")
            print("(1 - Hora, ")
            print("2 - Minuto) -> ")
            val unidadeDestino = readln().toInt()

            print("Digite o tempo: ")
            val tempo = readln().toDouble()

            var resultado = 0.0
            var unidade = ""
            if (unidadeOrigem == 1 && unidadeDestino == 2) {
                resultado = tempo * 60
                unidade = "m"
            } else if (unidadeOrigem == 2 && unidadeDestino == 1) {
                resultado = tempo / 60
                unidade = "h"
            } else {
                println("Opção inválida!")
                return
            }

            println("Resultado: $resultado$unidade")
        }

        else -> {
            println("Opção inválida!")
            return
        }
    }
}
