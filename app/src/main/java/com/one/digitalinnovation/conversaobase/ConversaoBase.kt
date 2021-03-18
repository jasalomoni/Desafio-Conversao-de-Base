package com.one.digitalinnovation.conversaobase

fun main(args: Array<String>) {

    var s: String
    var n: Int
    val r = """0x.*""".toRegex()

    while (true) {
//escreva sua solução aqui
        val entrada = readLine()!!.toString()

        if (entrada < 0.toString()) {
            break
        }

        if (entrada.substring(0, 1) == "0" && entrada.substring(1, 2) == "x") {
            var tama = entrada.length
            val numHexa = entrada.substring(2,tama)
            val decimalNumber = Integer.parseInt(numHexa, 16)
            println("$decimalNumber")
        } else {
            val hexaNumber = Integer.toHexString(entrada.toInt()).toUpperCase()
            println("0x$hexaNumber")
        }
    }
}

