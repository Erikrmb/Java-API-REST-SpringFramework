package com.erikrmb.apiErikRMB.domain.paciente;

import com.erikrmb.apiErikRMB.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente (

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
