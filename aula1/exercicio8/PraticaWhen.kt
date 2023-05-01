package exercicio8

fun main(args: Array<String>) {

    var dia: Int = readln().toInt()
    println(diaDaSemana(dia))

    var animal: String = readln()
    println(ehMamiferoReptilOuAve(animal))

    var letra: Char = readln().get(0)
    println(ehVogalOuConsoante(letra))

    var mes: Int = readln().toInt()
    println(mesPorExtenso(mes))

}

// a)
fun diaDaSemana(dia: Int): String {
    val diaPorExtenso: String = when (dia) {
        1 -> "Domingo"
        2 -> "Segunda-feira"
        3 -> "Terça-feira"
        4 -> "Quarta-feira"
        5 -> "Quinta-feira"
        6 -> "Sexta-feira"
        7 -> "Sábado"
        else -> "${dia} está incorreto."
    }
    return diaPorExtenso
}

// b)
fun ehMamiferoReptilOuAve(animal: String): String {
    val especie: String = when (animal) {
        "cachorro", "gato", "vaca", "cavalo", "macaco" -> "${animal} é um mamífero"
        "pato", "pombo", "galinha", "águia", "coruja" -> "${animal} é uma ave"
        "cobra", "jacaré", "lagarto", "tartaruga", "iguana" -> "${animal} é um réptil"
        else -> "Não foi possível identificar a espécie do animal -> ${animal}"
    }
    return especie
}

// c)
fun ehVogalOuConsoante(letra: Char): String {
    val letraEscolhida: String = when (letra) {
        'a' -> "A letra ${letra} é vogal"
        'e' -> "A letra ${letra} é vogal"
        'i' -> "A letra ${letra} é vogal"
        'o' -> "A letra ${letra} é vogal"
        'u' -> "A letra ${letra} é vogal"
        else -> "A letra ${letra} é consoante"
    }
    return letraEscolhida
}

// d)
fun mesPorExtenso(mes: Int): String {
    val mesPorExtenso: String = when (mes) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Ops... ${mes} está incorreto."
    }
    return mesPorExtenso
}