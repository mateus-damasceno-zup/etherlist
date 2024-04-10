package com.etherlist.etherlist.application.service.datahandler

import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
@Component
class DataExplosao {

    fun criarDataLista(): Instant = Instant.now()

    fun criaDataExplosao(timestamp: Instant): String {

        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
            .withZone(ZoneId.systemDefault())

        val dataExplosao = timestamp.plusSeconds(86400) // 86400 segundos = 24 horas
        val dataExplosaoFormatada = formatter.format(dataExplosao)
        return dataExplosaoFormatada
    }

}