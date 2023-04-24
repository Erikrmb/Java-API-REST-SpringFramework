package com.erikrmb.apiErikRMB.domain.paciente;

import com.erikrmb.apiErikRMB.domain.endereco.Endereco;
import com.erikrmb.apiErikRMB.domain.medico.Especialidade;

public record DadosDetalhamentoPaciente(
        Long id,
        String nome,
        String email,
        Endereco endereco

) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getEndereco());
    }
}
