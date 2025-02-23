fun main() {
    val precoPorDia = 90.0
    val precoPorKm = 0.20

    println("Digite a quantidade de Km percorridos:")
    val kmPercorridos = readLine()!!.toDouble()

    println("Digite a quantidade de dias alugados:")
    val diasAlugados = readLine()!!.toInt()

    val custoTotal = (diasAlugados * precoPorDia) + (kmPercorridos * precoPorKm)

    println("O preço total a pagar é: R$ $custoTotal")
}
