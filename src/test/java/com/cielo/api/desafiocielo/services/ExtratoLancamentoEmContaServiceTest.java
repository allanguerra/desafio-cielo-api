package com.cielo.api.desafiocielo.services;

import com.cielo.api.desafiocielo.domain.dto.ExtratoLancamentoEmContaDTO;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;

/**
 * Classe de testes unitários para a camada de serviços da aplicação. {@link ExtratoLancamentoEmContaService}
 * @author allanguerra
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExtratoLancamentoEmContaServiceTest {

    @Autowired
    private ExtratoLancamentoEmContaService service;

    @Rule
    public ErrorCollector error = new ErrorCollector();

    /*
    Test Methods
     */

    @Test
    public void DeveRetornarExtratoAPartirDoSistemaLegado() {

        List<ExtratoLancamentoEmContaDTO> listaLancamentos = this.service.obterListaDeLancamentosEmConta();

        error.checkThat(listaLancamentos, isA(List.class));
        error.checkThat(listaLancamentos.size(), is(not(0)));
    }
}
