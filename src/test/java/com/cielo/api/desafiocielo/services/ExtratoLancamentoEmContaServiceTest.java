package com.cielo.api.desafiocielo.services;

import com.cielo.api.desafiocielo.domain.dto.ExtratoLancamentoEmContaDTO;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    private final String EXPECTED_DATA_LANCAMENTO = "03-06-2016";
    private final String EXPECTED_DESCRICAO = "regular";
    private final Long EXPECTED_NUMERO = 64320236054L;
    private final String EXPECTED_SITUACAO = "Pago";
    private final String EXPECTED_DATA_CONFIRMACAO = "03-06-2016";
    private final String EXPECTED_DADOS_BANCARIOS = "BANCO ABCD S.A. Ag: 1 CC: 00000000065470";
    private final Double EXPECTED_VALOR_FINAL = 11499.1;

    /*
    Test Methods
     */

    @Test
    public void DeveRetornarExtratoAPartirDoSistemaLegado() throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        List<ExtratoLancamentoEmContaDTO> listaLancamentos = this.service.obterListaDeLancamentosEmConta();

        error.checkThat(listaLancamentos, isA(List.class));
        error.checkThat(listaLancamentos.size(), is(not(0)));

        error.checkThat(listaLancamentos.get(0).getDataLancamento(), is(dateFormat.parse(EXPECTED_DATA_LANCAMENTO)));
        error.checkThat(listaLancamentos.get(0).getDescricao(), is(EXPECTED_DESCRICAO));
        error.checkThat(listaLancamentos.get(0).getNumero(), is(EXPECTED_NUMERO));
        error.checkThat(listaLancamentos.get(0).getSituacao(), is(EXPECTED_SITUACAO));
        error.checkThat(listaLancamentos.get(0).getDataConfirmacao(), is(dateFormat.parse(EXPECTED_DATA_CONFIRMACAO)));
        error.checkThat(listaLancamentos.get(0).getDadosBancarios(), is(EXPECTED_DADOS_BANCARIOS));
        error.checkThat(listaLancamentos.get(0).getValorFinal(), is(EXPECTED_VALOR_FINAL));
    }
}
