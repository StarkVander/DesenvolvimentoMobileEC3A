fun main() {
    val valorPorHora = 25.0
    val horasPorDia = 8
    println("Digite o número de dias trabalhados no mês:")
    val diasTrabalhados = readLine()!!.toInt()
    val salario = diasTrabalhados * horasPorDia * valorPorHora
    println("O salário do funcionário é: R$$salario")
}
