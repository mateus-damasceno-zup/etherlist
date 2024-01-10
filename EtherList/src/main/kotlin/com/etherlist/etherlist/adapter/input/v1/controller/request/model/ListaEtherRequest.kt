package com.etherlist.etherlist.adapter.input.v1.controller.request.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "etherlist")
data class ListaEtherRequest (
    @Id
    val id : Int,
    val nome: String,
    val valor: Double
)