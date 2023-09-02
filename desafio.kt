// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado na formação $nome")
    }
}

fun main() {
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Banco de Dados", 120)
    val conteudo3 = ConteudoEducacional("Desenvolvimento Web", 150)

    val formacao1 = Formacao("Desenvolvedor Full Stack", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))
    
    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
}
