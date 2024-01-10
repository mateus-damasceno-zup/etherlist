package com.etherlist.etherlist.adapter.input.v1.controller.response

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.ListaEtherRequest

data class UsuarioListResponse(
    var listaEtherRequest : ListaEtherRequest?,
    var dataCriacao : String?,
    var dataExplosao : String?
)
