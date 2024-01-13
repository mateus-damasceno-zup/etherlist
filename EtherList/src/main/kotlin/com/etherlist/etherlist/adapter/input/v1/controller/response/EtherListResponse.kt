package com.etherlist.etherlist.adapter.input.v1.controller.response

import com.etherlist.etherlist.adapter.input.v1.controller.request.model.EtherListRequest

data class EtherListResponse(
    var etherListRequest : EtherListRequest?,
    var dataCriacao : String?,
    var dataExplosao : String?
)
