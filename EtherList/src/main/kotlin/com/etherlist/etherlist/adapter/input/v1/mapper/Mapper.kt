package com.etherlist.etherlist.adapter.input.v1.mapper

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.EtherListRequest
import com.etherlist.etherlist.adapter.input.v1.controller.request.model.ItensLista
import com.etherlist.etherlist.adapter.input.v1.controller.response.EtherListResponse
import com.etherlist.etherlist.adapter.output.rest.dto.EtherListRequestDTO
import com.etherlist.etherlist.adapter.output.rest.dto.EtherListResponseDTO
import com.etherlist.etherlist.adapter.output.rest.dto.ItensListaDTO

fun EtherListRequest.toDTO(): EtherListRequestDTO? = this.itensLista?.map { it?.toDTO() }?.let {
    this.id?.let { it1 ->
        EtherListRequestDTO(
        id = it1,
        itensListaDTO = it
    )
    }
}

fun EtherListRequestDTO.toRequest(): EtherListRequest? = this.itensListaDTO.map { it?.toRequest() }.let {
    EtherListRequest(
        id = this.id,
        itensLista = it
    )
}


fun ItensLista.toDTO(): ItensListaDTO = ItensListaDTO(
    nome = this.nome,
    valor = this.valor
)

fun ItensListaDTO.toRequest(): ItensLista = ItensLista(
    nome = this.nome,
    valor = this.valor
)

fun EtherListResponse.toDTO(): EtherListResponseDTO? = this.id?.let {
    EtherListResponseDTO(
        id = it,
        etherListRequest = this.etherListRequest?.map { it?.toDTO() },
        dataCriacao = this.dataCriacao,
        dataExplosao = this.dataExplosao
    )
}

fun EtherListResponseDTO.toResponse(): EtherListResponse = EtherListResponse(
    id = this.id,
    etherListRequest = this.etherListRequest?.map { it?.toRequest() },
    dataCriacao = this.dataCriacao,
    dataExplosao = this.dataExplosao
)