package strings

fun main(args: Array<String>) {

    /*
    Para imprimir variaveis podemos utilizar: ${variavel} ou ${objeto.propriedade}
    Se chama String Templates e evita a concatenação de Strings
     */

    var nome = "Rebeka"
    println("Olá $nome")

    println("$nome possui ${nome.length} caracteres")
    val msg = "Meu nome é $nome"
    println(msg)

}
