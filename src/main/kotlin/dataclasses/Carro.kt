package dataclasses

/*
    Data classes implementam automaticamente equals e hashcode, toString, copy e permite
    fácil acesso aos atributos, sem getters/setters

    O objeto companion, funciona como um singleton que vive dentro de outra classe e pode ser acessado
    sem a necessidade de instância
 */

data class Carro(val nome: String) {
    class CarroService {
        companion object {
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
}

fun main() {
    val carros = Carro.CarroService.getCarros()
    for (c in carros) {
        println(c)
    }

}
