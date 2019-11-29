package com.cielo.api.desafiocielo.domain.payload;

import lombok.Data;

import java.util.List;

@Data
public class ExtratoLancamentoCliente {

    private TotalControleLancamento totalControleLancamento;

    private List<ControleLancamento> listaControleLancamento;

    private Integer indice;

    private Integer tamanhoPagina;

    private Integer totalElements;

    /*
    Constructors
     */

    public ExtratoLancamentoCliente () {}

    public ExtratoLancamentoCliente(TotalControleLancamento totalControleLancamento, List<ControleLancamento> listaControleLancamento, Integer indice, Integer tamanhoPagina, Integer totalElements) {
        this.totalControleLancamento = totalControleLancamento;
        this.listaControleLancamento = listaControleLancamento;
        this.indice = indice;
        this.tamanhoPagina = tamanhoPagina;
        this.totalElements = totalElements;
    }
}
