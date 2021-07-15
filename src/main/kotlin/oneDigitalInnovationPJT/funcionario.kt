package oneDigitalInnovationPJT

import java.math.BigDecimal

abstract class funcionario(
     nome: String,
     cpf: String,
    val salario: BigDecimal
) : Pessoa(nome, cpf){
    abstract fun calculoAuxilio():
}
