package com.etherlist.etherlist.application.repository

import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@EnableMongoRepositories(basePackages = ["com.etherlist.etherlist.application.repository"])
class MongoConfig : AbstractMongoClientConfiguration(){

    override fun getDatabaseName(): String {
        return "etherlist"
    }

}