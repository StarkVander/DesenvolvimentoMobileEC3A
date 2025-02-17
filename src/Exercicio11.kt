fun main() {
    println("Digite a largura da parede em metros:")
    val largura = readLine()!!.toDouble()

    println("Digite a altura da parede em metros:")
    val altura = readLine()!!.toDouble()

    val area = largura * altura
    val tintaNecessaria = area / 2

    println("A área a ser pintada é: $area m²")
    println("A quantidade de tinta necessária é: $tintaNecessaria litros")
}
