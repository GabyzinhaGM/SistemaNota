package sistemanotas.aluno

open class Aluno(nota1: Float, nota2: Float, nota3: Float, nota4: Float) {
   public var nota1: Float = nota1
    public var nota2: Float = nota2
    public var nota3: Float = nota3
    public var nota4: Float = nota4


    fun  caucularMedia():Float{
        return (nota1+nota2+nota3+nota4)/4
    }

}

