package com.etherlist.etherlist.application.ports.input

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.EtherListRequest
import com.etherlist.etherlist.adapter.input.v1.mapper.toDTO
import com.etherlist.etherlist.adapter.output.rest.dto.EtherListResponseDTO
import com.etherlist.etherlist.adapter.output.rest.feign.CategoriaClient
import com.etherlist.etherlist.application.repository.EtherListReposiory
import com.etherlist.etherlist.application.service.datahandler.DataExplosao
import org.springframework.beans.factory.annotation.Autowired

interface EtherlistUseCase {

    fun saveEtherList(etherListRequests: EtherListRequest): EtherListResponseDTO?
    fun getEtherList(): List<EtherListResponseDTO?>?
    }