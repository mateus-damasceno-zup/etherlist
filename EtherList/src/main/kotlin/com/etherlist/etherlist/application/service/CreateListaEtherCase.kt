package com.etherlist.etherlist.application.service

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.EtherListRequest
import com.etherlist.etherlist.adapter.input.v1.controller.response.EtherListResponse
import com.etherlist.etherlist.adapter.input.v1.mapper.toDTO
import com.etherlist.etherlist.adapter.output.rest.dto.EtherListResponseDTO
import com.etherlist.etherlist.application.repository.EtherListReposiory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter


@Service
class CreateListaEtherCase (
    @Autowired private val repository: EtherListReposiory
){

    fun saveEtherList(etherListRequests: EtherListRequest): EtherListResponseDTO? {

        val now = Instant.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault())
        val formattedNow = formatter.format(now)

        val dataExplosao = now.plusSeconds(86400) // 86400 segundos = 24 horas
        val formattedDataExplosao = formatter.format(dataExplosao)

        var etherListResponse = EtherListResponse(
            id = etherListRequests.id,
            etherListRequest = listOf(etherListRequests),
            dataCriacao = formattedNow,
            dataExplosao =formattedDataExplosao
        )
        var saved = repository.insert(etherListResponse)
        return saved.toDTO()
    }


    fun getEtherList(): List<EtherListResponseDTO?>? {
        return  repository.findAll().map { it.toDTO() }
    }

}