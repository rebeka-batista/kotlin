package operadores

fun main(args: Array<String>) {
    println(enviarEmail("Rebeka"))
    println(enviarEmail("Rebeka", "Welcome"))
}

fun enviarEmail(usuario: String, titulo: String? = null): String {
    /*
    O operador Elvis ?: pode ser utilizado para a seguinte afirmação:
    Se o valor da variável não for nulo, use o seu próprio valor
    Caso contrário, use outro
     */
    val s = titulo ?: "Bem-vinda"
    return "$s $usuario"
}
