package funcao

fun main() {
    teste("Rebeka", "Batista", "2021")
    teste("Rebeka")
    teste("Rebeka", editora = "2021")
}

fun teste(nome: String, sobrenome: String? = null, editora: String? = null) {
    println("Nome $nome, Sobrenome $sobrenome, Editora $editora")
}
