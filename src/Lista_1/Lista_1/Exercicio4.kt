fun main() {
    println("Digite um valor: ")
    val valor1 = readLine()!!.toInt()

    println("Digite outro valor: ")
    val valor2 = readLine()!!.toInt()

    val soma = valor1 + valor2
    println("A soma entre $valor1 e $valor2 é igual a $soma.")
}
