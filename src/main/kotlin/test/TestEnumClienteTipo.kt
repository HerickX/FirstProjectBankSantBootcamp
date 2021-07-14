package test

import oneDigitalInnovationPJT.clienteTipo

fun main() {
    clienteTipo.values().forEach {
        println("${it.name}- $it")
    }
    
    clienteTipo.values().forEach { elemento ->

        println("${elemento.name}- $elemento")


    }}