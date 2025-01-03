enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(var nome: String, var idade: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        for (aluno in inscritos) {
            println(aluno.nome)
            println(aluno.idade)
        }
    }
}

fun main() {
    val user = Usuario("Vitor Manzano", 18)
    var conteudo = mutableListOf<ConteudoEducacional>()
    val maria = Usuario("Maria", 20)
    var forma = Formacao("Engenharia de software",conteudo)
    forma.matricular(user)
    forma.matricular(maria)
}
