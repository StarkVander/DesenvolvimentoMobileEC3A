fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toDouble()
    val dobro = numero * 2
    val terco = numero / 3

    println("O dobro de $numero é $dobro")
    println("A terça parte de $numero é $terco")
}
