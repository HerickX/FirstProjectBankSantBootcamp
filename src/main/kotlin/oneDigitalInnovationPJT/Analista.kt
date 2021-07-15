package oneDigitalInnovationPJT

class Analista(nome: String,
               cpf: String,
               salario: Double) :
               funcionario(nome, cpf, salario) {
    override fun calculoAuxilio() = salario * 0.1

}
