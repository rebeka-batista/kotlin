package variaveis

/*
    Para converter de um tipo para o outro, é utilizado o operador as
    Pode lançar exception caso nao seja possivel converter, para isso,
    utilizamos o 'as?' que retorna null ao invés de uma exception
 */

fun main(args: Array<String>) {

    val s: Any = "Rebeka"
    println(s as String)
    println(s as? Int)
    if (s is String) {
        println("$s é uma String")
    }

}
