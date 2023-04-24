package com.erikrmb.apiErikRMB.domain.consulta.validacoes;

import com.erikrmb.apiErikRMB.domain.ValidacaoException;
import com.erikrmb.apiErikRMB.domain.consulta.DadosAgendamentoConsulta;
import com.erikrmb.apiErikRMB.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private PacienteRepository pacienteRepository;

    public void validar(DadosAgendamentoConsulta dadosAgendamentoConsulta){
        var pacienteEstaAtivo = pacienteRepository.findAtivoById(dadosAgendamentoConsulta.idPaciente());
        if(!pacienteEstaAtivo){
            throw new ValidacaoException("");
        }
    }
}
