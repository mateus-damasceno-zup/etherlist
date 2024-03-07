package com.etherlist.etherlist.adapter.input.v1.controller

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.EtherListRequest
import com.etherlist.etherlist.adapter.output.rest.dto.EtherListResponseDTO
import com.etherlist.etherlist.application.service.CreateListaEtherCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/etherlist")
class EtherListController (
    @Autowired
    private val service: CreateListaEtherCase
){
    @PostMapping("/save")
    fun saveEtherList(@RequestBody etherListRequests: EtherListRequest): ResponseEntity<EtherListResponseDTO> {
        val savedEtherListDto = service.saveEtherList(etherListRequests)
        return ResponseEntity.ok().body(savedEtherListDto)
    }
    @GetMapping("/all")
    fun getAllEtherData(): ResponseEntity<List<EtherListResponseDTO?>> {
        val allDataDTOs = service.getEtherList()
        return ResponseEntity.ok(allDataDTOs)
    }


}