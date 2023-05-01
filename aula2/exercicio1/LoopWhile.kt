
fun main(args: Array<String>) {

    var cont: Int = 0

    // 1) Faça um loop while que imprima todos os números de 1 a 10:
    while (cont < 10) {
        cont++
        println(cont)
    }

    //2) Faça um loop while que imprima todos os números pares de 0 a 20:
    cont = 0 // <- resetando a variável
    while(cont <= 20) {
        if (cont % 2 == 0) {
            println(cont)
        }
        cont++
    }

    //3) Faça um loop while que imprima todos os números ímpares de 10 a 0:
    cont = 10
    while(cont > 0) {
        if(cont % 2 != 0) {
            println(cont)
        }
        cont--
    }

}

