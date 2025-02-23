fun main() {
    println("Digite o preço do produto:")
    val precoOriginal = readLine()!!.toDouble()
    val desconto = 0.05
    val precoPromocional = precoOriginal - (precoOriginal * desconto)
    println("O preço promocional é: R$ ${"%.2f".format(precoPromocional)}")
}
