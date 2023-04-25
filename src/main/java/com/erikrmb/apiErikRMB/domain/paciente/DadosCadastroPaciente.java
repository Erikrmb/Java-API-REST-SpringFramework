package com.erikrmb.apiErikRMB.domain.paciente;

import com.erikrmb.apiErikRMB.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        String cpf, @NotNull
        @Valid
        DadosEndereco endereco) {
}
