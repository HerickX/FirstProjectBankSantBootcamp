package oneDigitalInnovationPJT

abstract class funcionario(
     nome: String,
     cpf: String,
    val salario: Double
) : Pessoa(nome, cpf){
   protected abstract fun calculoAuxilio(): Double

    override fun toString(): String ="""
    nome: $nome
    cpf: $cpf
    Salario: $salario
    Auxilio: ${calculoAuxilio()}
    """.trimIndent()

    }





