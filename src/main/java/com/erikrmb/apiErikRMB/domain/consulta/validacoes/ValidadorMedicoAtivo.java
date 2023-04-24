package com.erikrmb.apiErikRMB.domain.consulta.validacoes;

import com.erikrmb.apiErikRMB.domain.ValidacaoException;
import com.erikrmb.apiErikRMB.domain.consulta.DadosAgendamentoConsulta;
import com.erikrmb.apiErikRMB.domain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private MedicoRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        if(dados.idMedico() == null){
            return;
        }

        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());
        if(!medicoEstaAtivo){
            throw new ValidacaoException("Consulta nao pode ser agendada com medico");
        }
    }
}
