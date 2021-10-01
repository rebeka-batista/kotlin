package funcao

fun main() {
    var nome = "Rebeka"
    imprimir(nome)
    val soma = somar(2, 3)
    imprimir("Soma: $soma")
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun imprimir(s: String) {
    println(s)
}
