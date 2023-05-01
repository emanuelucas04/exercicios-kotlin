package aula4

fun main(args: Array<String>) {
    print("Informe um número para ser calculado o n-ésimo termo: ")
    var num: Int = readln().toInt()
    for (i in 0..num) {
        var result: Int = fibonacci(i)
        println("Termo ${i} = $result")
    }
}

tailrec fun fibonacci(n: Int): Int {
    if (n == 0 || n == 1)
        return 1
    else
        return fibonacci(n - 1) + fibonacci(n - 2)
}