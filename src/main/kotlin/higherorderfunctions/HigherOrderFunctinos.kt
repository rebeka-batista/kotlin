package higherorderfunctions

fun filtrar(list: List<Int>, filtro: (Int) -> (Boolean)): List<Int> {
    val newList = arrayListOf<Int>()
    for (item in list) {
        if (filtro(item)) {
            newList.add(item)
        }
    }
    return newList
}

fun numerosPares(numero: Int) = numero % 2 == 0
fun numerosMaiorQue3(numero: Int) = numero > 3


/*
      O Kotlin permite que funções recebam outras funções como parâmetro,
      além de permitir que uma função retorne outra função (Higher-Order Functions)

      A sintaxe ::funcao é utilizada para passar uma função como parâmetro, se a função
      tiver os mesmos argumentos que a função desejada, a chamada será feita
 */


fun main() {
    val ints = listOf(1, 2, 3, 4, 5)
    println(ints)
    var list = filtrar(ints, ::numerosPares)
    println(list)

    /*
    Com lambda:
    var list = filtrar(ints, {numero:Int -> numerosPares(numero)})
    println(list)

    -> Sempre que a função receber receber apenas um parâmetro, poderemos usar o parâmetro "it"
       var list = filtrar(ints, {numero:Int -> numerosPares(it)})
       ou
       var list = filtrar(ints) { it % 2 == 0)
       println(list)

       var list = filtrar(ints) { it > 3)
       println(list)
     */

    list = filtrar(ints, ::numerosMaiorQue3)
    println(list)
}
