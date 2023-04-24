package com.erikrmb.apiErikRMB.controller;
import com.erikrmb.apiErikRMB.domain.consulta.AgendaDeConsultas;
import com.erikrmb.apiErikRMB.domain.consulta.DadosAgendamentoConsulta;
import com.erikrmb.apiErikRMB.domain.consulta.DadosDetalhamentoConsulta;
import com.erikrmb.apiErikRMB.domain.medico.DadosDetalhamentoMedico;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consultas")
@SecurityRequirement(name = "bearer-key")
public class ConsultaController {

    @Autowired
    private AgendaDeConsultas agendaDeConsultas;

    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamentoConsulta dados){
        var dto = agendaDeConsultas.agendar(dados);
        return ResponseEntity.ok(dto);
    }
}
