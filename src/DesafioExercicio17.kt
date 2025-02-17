fun main() {
    println("Digite a quantidade de cigarros fumados por dia:")
    val cigarrosPorDia = readLine()!!.toInt()

    println("Digite quantos anos você já fumou:")
    val anosFumando = readLine()!!.toInt()

    val minutosPerdidosPorCigarro = 10
    val diasPorAno = 365
    val minutosPorDia = 1440

    val totalCigarros = cigarrosPorDia * diasPorAno * anosFumando
    val totalMinutosPerdidos = totalCigarros * minutosPerdidosPorCigarro
    val totalDiasPerdidos = totalMinutosPerdidos / minutosPorDia

    println("Você perderá um total de $totalDiasPerdidos dias de vida.")
}
