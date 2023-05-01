package aula4

fun main(args: Array<String>) {
    println("Informe dois números para ser calculado o MDC:")
    print("número 1: ")
    var num1: Int = readln().toInt()
    print("número 2: ")
    var num2: Int = readln().toInt()
    print("O MDC de $num1 e $num2 é: ${mdc(num1, num2)}")
}

tailrec fun mdc(x: Int, y: Int): Int {
    if (y == 0) return x

    return mdc(y, x % y)
}