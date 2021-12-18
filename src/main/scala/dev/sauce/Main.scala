package dev.sauce

import dev.sauce.hello.Greeting

object Main extends App {
    println("Hola!")
    val g = Greeting(name=Some("OCC"))
    println(g)
}
