package com.etherlist.etherlist.adapter.input.v1.controller

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.ListaEtherRequest
import com.etherlist.etherlist.application.service.CreateListaEtherCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lista-ether")
class UsuarioController (
    private val createListaEtherCase: CreateListaEtherCase
){
    @PostMapping
    fun createUsuario (@RequestBody listaEtherRequest: ListaEtherRequest): ResponseEntity<ListaEtherRequest>{
        val createListEther = createListaEtherCase.save(listaEtherRequest)

        return ResponseEntity.ok(createListEther)
    }

//    @GetMapping("/{listaEther}")
//    fun getUsuario(@PathVariable listaEther:String): ResponseEntity<ListaEtherRequest>{
//        val listaEther = //findbyid
//            return if(user != null){
//                val userDTO = userMapper.toDTO(user)
//                ResponseEntity.ok(userDTO)
//            }else{
//                ResponseEntity.notFound().build()
//            }
//    }

}