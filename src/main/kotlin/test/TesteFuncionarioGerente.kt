package test

import oneDigitalInnovationPJT.Gerente


fun main(){

val Maria = Gerente ("Maria do Carmo", "1234567899",5000.0, "senha123" )
ImprimeRelatorioFuncionario.imrprime(Maria)

    TesteAutenticacao().autentica(Maria)
}
