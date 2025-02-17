fun main() {
    println("Digite o salário do funcionário:")
    val salario = readLine()!!.toDouble()
    val aumento = salario * 0.15
    val novoSalario = salario + aumento
    println("O novo salário com 15% de aumento é: R$ $novoSalario")
}
