package sistemanotas.aluno

fun main() {
    val aluno:Aluno = Aluno(8.0f, 10.0f, 9.5f, 9.0f)

    println("As notas são: ${aluno.nota1}, ${aluno.nota2}, ${aluno.nota3}, ${aluno.nota4}")
    println("A média é: "+aluno.caucularMedia())
}
