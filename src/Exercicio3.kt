fun main() {
    print("Nome do Funcionário: ")
    val nome = readLine() ?: ""

    print("Salário: ")
    val salario = readLine() ?: "0.0"

    println("O funcionário $nome tem um salário de R$$salario em junho.")
}
