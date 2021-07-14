package test

import oneDigitalInnovationPJT.clienteTipo

fun main() {
    clienteTipo.values().forEach {
        println("${it.name}- ${it.descricao}")
    }
     
    clienteTipo.values().forEach { elemento ->

        println("${elemento.name}- ${elemento.descricao}")


    }
val  pf = clienteTipo.PF
    println(">> ${pf.name}- ${pf.descricao}")

    val  pj = clienteTipo.PJ
    println(">> ${pj.name}- ${pj.descricao}")
}


