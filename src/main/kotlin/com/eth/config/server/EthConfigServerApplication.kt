package com.eth.config.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer


@SpringBootApplication
@EnableConfigServer
class EthConfigServerApplication

fun main(args: Array<String>) {
    runApplication<EthConfigServerApplication>(*args)
}