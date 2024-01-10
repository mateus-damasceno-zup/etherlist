package com.etherlist.etherlist.application.service

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.ListaEtherRequest
import com.etherlist.etherlist.application.repository.ListaEtherReposioryMongoDB
import org.springframework.stereotype.Service

@Service
class CreateListaEtherCase (private val repository: ListaEtherReposioryMongoDB){

    fun save(ether: ListaEtherRequest): ListaEtherRequest {
        return repository.save(ether)
    }


}