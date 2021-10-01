package variaveis


fun main() {

    /*
    O Kotlin não permite que variaveis e objetos tenham valor nulo, só se for
    indicado no código usando o operador '?' no tipo da variável
   */

    var nome: String? = "Rebeka"
    println("Olá $nome")

    nome = null
    println("Olá $nome")

    /*
    Caso uma variavel nula seja acessada indevidamente, teremos uma exception
    Sendo assim, precisamos validar se a variável não é nula
    Uma outra opção é utilizar o operador '?', que ignora a chamada se o objeto for nulo
        println("$nome possui ${nome?.length} caracteres")
     */
    if (nome != null) println("$nome possui ${nome.length} caracteres")
}
