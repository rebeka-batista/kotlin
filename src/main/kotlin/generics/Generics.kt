package generics

/*
    Quando temos funções iguais podemos usar generics ao invés de replicar código
 */

fun main() {
    val strings = toList<String>("Rebeka", "Batista")
    println(strings)
    val ints = toList<Int>(1, 2, 3, 4, 5)
    println(ints)
}

fun <T> toList(vararg args: T): List<T> {
    val list = ArrayList<T>()
    for (s in args) list.add(s)
    return list
}
