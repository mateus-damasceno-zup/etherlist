package com.etherlist.etherlist.application.repository

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.ListaEtherRequest
import org.springframework.data.mongodb.repository.MongoRepository

interface ListaEtherReposioryMongoDB:MongoRepository<ListaEtherRequest,String> {


}