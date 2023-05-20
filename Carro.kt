class Carro(var modelo: String, var marca: String, var ano: Int, var preco: Double) {
    fun exibirAtributos(): String {
        return "Modelo: $modelo\nMarca: $marca\nAno: $ano\nPreco: $preco"
    }
}

fun main() {
    var meuCarro = Carro("Camaro", "Chevrolet", 2013, 100000.0)
    println(meuCarro.exibirAtributos())
}