package oneDigitalInnovationPJT

import java.math.BigDecimal

class funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal
) : Pessoa(nome, cpf){
}
