package singletons

/*
    Em Kotlin, para deixar um objeto como Singleton utilize a palavra "object" ao invés de class
    Objetos Singleton tem uma única instância durante a execução do programa, ou seja, se armazenar
    atributos na classe, eles serão compartilhados por todo o app
    É bom para ser usado com métodos que retornem objetos
 */

data class Carro(val nome: String) {
    object CarroService {
        fun getCarros(): List<Carro> {
            val carros = mutableListOf<Carro>()
            for (i in 1..3) {
                val c = Carro("Carro $i")
                carros.add(c)
            }
            return carros
        }
    }
}


fun main() {
    val carros = Carro.CarroService.getCarros()
    for (c in carros) {
        println(c)
    }
}
