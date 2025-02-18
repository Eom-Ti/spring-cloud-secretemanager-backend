package com.example.clientserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClientServerApplication

fun main(args: Array<String>) {
    runApplication<ClientServerApplication>(*args)
}
