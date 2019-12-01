package com.cielo.api.desafiocielo.services;

import com.cielo.api.desafiocielo.domain.dto.ExtratoLancamentoEmContaDTO;
import com.cielo.api.desafiocielo.domain.payload.ExtratoLancamentoCliente;
import com.cielo.api.desafiocielo.infra.exceptions.DataNotFoundException;
import com.cielo.api.desafiocielo.infra.exceptions.enums.ErrorType;
import com.cielo.api.desafiocielo.legacy.LegacyFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Camade de serviço, processa dados recebidos da integração com o sistema legado.
 * @author allanguerra
 */
@Service
public class ExtratoLancamentoEmContaService {

    @Autowired
    private LegacyFacade facade;

    public List<ExtratoLancamentoEmContaDTO> obterListaDeLancamentosEmConta() {

        ExtratoLancamentoCliente extratoLancamentoCliente = this.facade.listarExtratoDeLancamentos();

        if(extratoLancamentoCliente == null) {
            throw new DataNotFoundException(ErrorType.DT01, "Desculpe, não encontramos os lançamentos.");
        }

        List<ExtratoLancamentoEmContaDTO> listaDeLancamentos = extratoLancamentoCliente.getListaControleLancamento()
                .stream()
                .map(controleLancamento -> new ExtratoLancamentoEmContaDTO(controleLancamento))
                .collect(Collectors.toList());

        return listaDeLancamentos;
    }
}
