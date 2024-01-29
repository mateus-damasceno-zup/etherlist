package com.etherlist.etherlist.adapter.output.rest.dto

data class EtherListResponseDTO(
    var id: String,
    var etherListRequest: List<EtherListRequestDTO?>?,
    var dataCriacao: String?,
    var dataExplosao: String?
)


