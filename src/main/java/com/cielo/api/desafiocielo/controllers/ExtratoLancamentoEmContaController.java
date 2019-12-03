package com.cielo.api.desafiocielo.controllers;

import com.cielo.api.desafiocielo.domain.dto.ExtratoLancamentoEmContaDTO;
import com.cielo.api.desafiocielo.services.ExtratoLancamentoEmContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Camade de controle da aplicação.
 * Recebe e Responde requisições.
 * @author allanguerra
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/extrato-lancamento")
public class ExtratoLancamentoEmContaController {

    @Autowired
    private ExtratoLancamentoEmContaService service;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<ExtratoLancamentoEmContaDTO>> index() {
        List<ExtratoLancamentoEmContaDTO> response = service.obterListaDeLancamentosEmConta();
        return ResponseEntity.ok(response);
    }
}
