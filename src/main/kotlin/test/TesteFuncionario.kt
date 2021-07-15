package test

import oneDigitalInnovationPJT.Pessoa
import oneDigitalInnovationPJT.funcionario
import java.math.BigDecimal
fun main(){
val Herick =  Pessoa(nome = "Herick Xavier", cpf = "1234567899"  )
println(Herick.nome)
println(Herick.cpf)

val Joao = funcionario("Herick Xavier", "1234567899", BigDecimal.valueOf(2000.0))
println(Joao.nome)
println(Joao.cpf)
println(Joao.salario)

}
