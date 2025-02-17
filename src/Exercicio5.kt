fun main() {
    println("Digite a Nota 1:")
    val nota1 = readLine()!!.toDouble()

    println("Digite a Nota 2:")
    val nota2 = readLine()!!.toDouble()

    val media = (nota1 + nota2) / 2
    println("A média entre $nota1 e $nota2 é igual a $media")
}
