package com.erikrmb.apiErikRMB.domain.medico;

import com.erikrmb.apiErikRMB.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico (

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
