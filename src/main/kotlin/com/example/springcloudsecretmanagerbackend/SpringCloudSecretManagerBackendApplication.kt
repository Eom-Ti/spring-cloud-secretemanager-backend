package com.example.springcloudsecretmanagerbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class SpringCloudSecretManagerBackendApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudSecretManagerBackendApplication>(*args)
}
