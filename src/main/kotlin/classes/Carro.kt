package classes

/*
   Para criar uma classe usamos "class", o construtor padrão é declarado na mesma linha da classe
   Para herdar de uma classe, basta utilizar :
 */

class Carro(nome: String, ano: Int) : Automovel(nome, ano) {
    override fun acelerar(velocidade: Int) {
        print("Acelerando este carro $velocidade")
    }
}


fun main() {
    val c1 = Carro("Fusca", 1950)
    c1.acelerar(100)
    println(c1)
}
