package classes

/*
    Para q a herança seja realizada, essa classe foi anotada como open, pois pro Kotlin
    todas as classes são final por padrão, ou seja, não é possível utilizar herança
 */

open class Automovel(nome: String, ano: Int) {

    val nome: String
    val ano: Int

    init {
        this.nome = nome
        this.ano = ano
    }

    override fun toString(): String {
        return "\nAutomóvel $nome, ano: $ano"
    }

    open fun acelerar(velocidade: Int) {
        print("Acelerando este automóvel $velocidade")
    }

}
