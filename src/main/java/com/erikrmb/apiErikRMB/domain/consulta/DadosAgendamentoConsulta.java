package com.erikrmb.apiErikRMB.domain.consulta;

import com.erikrmb.apiErikRMB.domain.medico.Especialidade;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long id,
        @NotNull
        Long idPaciente,

        @NotNull
        Long idMedico,

        @NotNull
        @Future
        LocalDateTime data,

        Especialidade especialidade){
}
