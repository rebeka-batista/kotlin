package variaveis

/*
    O tipo da variável pode ser omitido se um valor for atribuído
    Só podemos alterar o valor de variáveis declaradas com var
    Se utilizar val, sera constante e não poderá ser alterada
 */

fun main(args: Array<String>) {

    var nome = "Rebeka"
    println("Olá $nome")
    nome = "Beka"
    println("Olá $nome")

}
