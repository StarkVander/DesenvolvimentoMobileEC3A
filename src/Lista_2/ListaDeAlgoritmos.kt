package Lista_2

fun main(){
    // Chamar os exercicios feitos por funções:

    //exercicio1()
    //exercicio2()
    //exercicio3()
    //exercicio4()
    exercicio5()

}

// •	Escreva um programa que mostre na tela a mensagem "Olá, Mundo!"
fun exercicio1() {
    println("Olá, Mundo!")
}

/*•	Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas- vindas para ela:
Ex: Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer! */
fun exercicio2(){
    println("Qual é o seu nome? ")
    val nome = readLine()
    println("Olá $nome, é um prazer te conhecer!")
}

/*
•	Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.

 */
fun exercicio3(){
    println("Qual é o seu nome? ")
    val nome = readLine()
    println("Qual é o seu salario? ")
    val salario = readLine()

    println("O funcionário $nome tem um salário de R$$salario em Junho.")
}

/*
•	Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
 */

fun exercicio4(){

    val a: Int = 5
    val b: Int = 125
    val soma: Int = a + b

    println("A soma de a + b é: $soma")

}

/*
•	•	Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.
 */

