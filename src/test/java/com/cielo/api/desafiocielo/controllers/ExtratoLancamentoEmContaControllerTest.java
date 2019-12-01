package com.cielo.api.desafiocielo.controllers;

import com.cielo.api.desafiocielo.domain.dto.ExtratoLancamentoEmContaDTO;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;

/**
 * Classe de testes de integração para a camada de controle da aplicação. {@link ExtratoLancamentoEmContaController}
 * @author allanguerra
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ExtratoLancamentoEmContaControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Rule
    public ErrorCollector error = new ErrorCollector();

    /*
    Test Methods
     */

    @Test
    public void DeveRetornarStatus200AoObterExtratoDeLancamentosEmConta() throws Exception {

        ParameterizedTypeReference<List<ExtratoLancamentoEmContaDTO>> typeReference =
                new ParameterizedTypeReference<List<ExtratoLancamentoEmContaDTO>>() {};

        ResponseEntity<List<ExtratoLancamentoEmContaDTO>> response =
                testRestTemplate.exchange("/extrato-lancamento", HttpMethod.GET, null, typeReference);

        error.checkThat(response.getStatusCode(), is(HttpStatus.OK));
        error.checkThat(response.getHeaders().getContentType(), is(MediaType.APPLICATION_JSON));
        error.checkThat(response.getBody().size(), is(not(0)));
    }
}
