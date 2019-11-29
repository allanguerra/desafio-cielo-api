package com.cielo.api.desafiocielo.services;

import com.cielo.api.desafiocielo.domain.dto.ExtratoLancamentoEmContaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExtratoLancamentoEmContaService {

    public List<ExtratoLancamentoEmContaDTO> obterListaDeLancamentosEmConta() {

        List<ExtratoLancamentoEmContaDTO> listaDeLancamentos = new ArrayList<>();
        return listaDeLancamentos;
    }
}
