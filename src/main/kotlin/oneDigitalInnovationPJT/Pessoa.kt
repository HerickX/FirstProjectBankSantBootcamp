package oneDigitalInnovationPJT

class Pessoa {
    var nome: String = "Herick"
    var cpf: String = "123.456.789.11"
    private set

    constructor()
    fun pessoaInfo()= "$nome e $cpf"


}


fun main() {
  val Herick =  Pessoa()

    println(Herick.pessoaInfo())


}
