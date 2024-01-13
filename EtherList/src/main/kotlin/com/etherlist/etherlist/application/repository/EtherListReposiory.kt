package com.etherlist.etherlist.application.repository

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.EtherListRequest
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository


@Repository
interface EtherListReposiory:MongoRepository<EtherListRequest,String>{

    fun insert(etherListRequest: EtherListRequest): EtherListRequest?
}


