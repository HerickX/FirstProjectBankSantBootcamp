package oneDigitalInnovationPJT

class Gerente(
    nome: String,
    cpf: String,
    salario: Double

) : funcionario(nome= nome, cpf= cpf, salario = salario) {
    override fun calculoAuxilio(): Double= salario*0.4


}