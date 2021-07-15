package test

import oneDigitalInnovationPJT.banco

fun main() {
    val digiOneBank = banco (nome= "DigiOne", numero=12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 =  digiOneBank.copy(nome= "Banco2" )
    println(banco2.info())

}


