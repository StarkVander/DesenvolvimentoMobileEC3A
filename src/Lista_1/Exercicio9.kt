fun main() {
    println("Digite uma distância em metros:")
    val metros = readLine()!!.toDouble()

    val centimetros = metros * 100
    val milimetros = metros * 1000
    val quilometros = metros / 1000

    println("Distância de $centimetros Cm")
    println("Distância de $milimetros Mm")
    println("Distância de $quilometros Km")
}
