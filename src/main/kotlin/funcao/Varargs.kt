package funcao

/*
    Vararg é um tipo especial de parâmetro que pode receber um ou mais parâmetros, separados por vírgula
 */

fun main() {
    val list = toList("Rebeka", "Batista", "Rodrigues")
    println(list)
}

fun toList(vararg args: String): List<String> {
    val list = ArrayList<String>()
    for (s in args) list.add(s)
    return list
}
