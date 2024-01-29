package com.etherlist.etherlist.adapter.input.v1.controller.response

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.EtherListRequest
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId

@Document("etherListRequest")
data class EtherListResponse(
    @Id
    var id: String?,
    var etherListRequest: List<EtherListRequest?>?,
    var dataCriacao: String?,
    var dataExplosao: String?
)
