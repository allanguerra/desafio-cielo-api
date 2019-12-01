package com.cielo.api.desafiocielo.domain.payload;

import lombok.Data;

/**
 * Mapeamento do Sistema Legado - Total do Controle de Lançamentos.
 * @author allanguerra
 */
@Data
public class TotalControleLancamento {

    private Integer quantidadeLancamentos;

    private Integer quantidadeRemessas;

    private Double valorLancamentos;

    /*
    Constructors
     */

    public TotalControleLancamento () {}

    public TotalControleLancamento(Integer quantidadeLancamentos, Integer quantidadeRemessas, Double valorLancamentos) {
        this.quantidadeLancamentos = quantidadeLancamentos;
        this.quantidadeRemessas = quantidadeRemessas;
        this.valorLancamentos = valorLancamentos;
    }
}
