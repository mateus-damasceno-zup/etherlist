package com.etherlist.etherlist.application.service

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.EtherListRequest
import com.etherlist.etherlist.application.repository.EtherListReposiory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateListaEtherCase (
    @Autowired private val repository: EtherListReposiory){

    fun insert(ether: EtherListRequest?): EtherListRequest? {

        return ether?.let { repository.insert(ether)}
    }
//    fun getAllEtherlist(listof: Ether?): List<EtherListRequest> {
//        return repository.findAll()
//    }

}