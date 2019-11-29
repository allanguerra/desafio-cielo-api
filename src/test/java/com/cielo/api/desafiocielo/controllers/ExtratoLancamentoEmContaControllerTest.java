package com.cielo.api.desafiocielo.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ExtratoLancamentoEmContaController.class)
public class ExtratoLancamentoEmContaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /*
    Test Methods
     */

    @Test
    public void DeveRetornarStatus200AoObterExtratoDeLancamentosEmConta() throws Exception {

        mockMvc.perform(get("/extrato-lancamento")
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk());
    }
}
