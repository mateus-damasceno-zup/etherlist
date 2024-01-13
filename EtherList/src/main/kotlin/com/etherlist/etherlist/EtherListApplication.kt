package com.etherlist.etherlist

import com.etherlist.etherlist.application.repository.EtherListReposiory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories


@SpringBootApplication
class EtherlistApplication

fun main(args: Array<String>) {
	runApplication<EtherlistApplication>(*args)
}
