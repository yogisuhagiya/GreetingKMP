package com.jetbrains.greeting
import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "Hi!" else "Hello!")

        val firstWord = "Name";
        add("$firstWord guess what this is! > ${platform.name.reversed()}!")
        add("My name is Yogi")
    }
}