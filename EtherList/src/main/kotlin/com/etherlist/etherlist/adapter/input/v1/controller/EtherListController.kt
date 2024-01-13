package com.etherlist.etherlist.adapter.input.v1.controller

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.EtherListRequest
import com.etherlist.etherlist.application.service.CreateListaEtherCase
import com.mongodb.DBObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/lista-ether")
class EtherListController (
    @Autowired
    private val etherListCase: CreateListaEtherCase
){
    @PostMapping
    fun newEtherList (@RequestBody etherListRequest: EtherListRequest): ResponseEntity<EtherListRequest>{
        val createListEther = etherListCase.insert(etherListRequest)

        return ResponseEntity.ok(createListEther)
    }

//    @GetMapping("/{name}")
//    fun get(@PathVariable name: String?): MutableList<DBObject>? {
//        val listAllEtherList = etherListCase.getAllEtherlist(Any?)
//        return ResponseEntity.ok(listAllEtherList)
//    }

}