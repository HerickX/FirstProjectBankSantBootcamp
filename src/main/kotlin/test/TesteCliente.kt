package test

import oneDigitalInnovationPJT.Cliente
import oneDigitalInnovationPJT.clienteTipo

fun main()
{
    val Jose= Cliente(
        nome = "Jose da Silva",
        cpf = "123.456.789.00",
        clienteTipo= clienteTipo.PF,
        senha="123456"
    )
println(Jose)
    TesteAutenticacao().autentica(Jose)

}