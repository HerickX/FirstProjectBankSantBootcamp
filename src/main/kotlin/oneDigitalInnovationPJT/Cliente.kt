package oneDigitalInnovationPJT

class Cliente(
    nome: String,
    cpf: String ,
    val clienteTipo: clienteTipo,
    val senha: String
): Pessoa(nome,cpf), Logavel {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
    nome:    $nome
    cpf:     $cpf
    Tipo:    ${clienteTipo.descricao}

    """.trimIndent()



}