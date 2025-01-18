package com.example.cloudsecretmanagerbackendserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class CloudSecretmanagerBackendServerApplication

fun main(args: Array<String>) {
    runApplication<CloudSecretmanagerBackendServerApplication>(*args)
}
