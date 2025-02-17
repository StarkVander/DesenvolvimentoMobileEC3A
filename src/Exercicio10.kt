fun main() {
    val cotacaoDolar = 3.45
    println("Digite quanto dinheiro você tem na carteira (em R$): ")
    val dinheiroNaCarteira = readLine()!!.toDouble()
    val dolares = dinheiroNaCarteira / cotacaoDolar
    println("Você pode comprar US$${"%.2f".format(dolares)}.")
}
