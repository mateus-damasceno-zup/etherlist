package com.etherlist.etherlist.adapter.input.v1.controller.request.model


import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId


@Document("etherlist")
data class EtherListRequest (
    @MongoId
    val id : ObjectId = ObjectId(),
    val nome: String,
    val valor: String
)