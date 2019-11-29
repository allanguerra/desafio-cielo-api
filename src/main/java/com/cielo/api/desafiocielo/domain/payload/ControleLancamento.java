package com.cielo.api.desafiocielo.domain.payload;

import lombok.Data;

import java.util.Date;

@Data
public class ControleLancamento {

    private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;

    private String dataEfetivaLancamento;

    private String dataLancamentoContaCorrenteCliente;

    private Long numeroEvento;

    private String descricaoGrupoPagamento;

    private Integer codigoIdentificadorUnico;

    private String nomeBanco;

    private Integer quantidadeLancamentoRemessa;

    private String numeroRaizCNPJ;

    private String numeroSufixoCNPJ;

    private Double valorLancamentoRemessa;

    private Date dateLancamentoContaCorrenteCliente;

    private Date dateEfetivaLancamento;

    /*
    Constructors
     */

    public ControleLancamento () {}

    public ControleLancamento(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente, String dataEfetivaLancamento, String dataLancamentoContaCorrenteCliente, Long numeroEvento, String descricaoGrupoPagamento, Integer codigoIdentificadorUnico, String nomeBanco, Integer quantidadeLancamentoRemessa, String numeroRaizCNPJ, String numeroSufixoCNPJ, Double valorLancamentoRemessa, Date dateLancamentoContaCorrenteCliente, Date dateEfetivaLancamento) {
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
        this.dataEfetivaLancamento = dataEfetivaLancamento;
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
        this.numeroEvento = numeroEvento;
        this.descricaoGrupoPagamento = descricaoGrupoPagamento;
        this.codigoIdentificadorUnico = codigoIdentificadorUnico;
        this.nomeBanco = nomeBanco;
        this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
        this.numeroRaizCNPJ = numeroRaizCNPJ;
        this.numeroSufixoCNPJ = numeroSufixoCNPJ;
        this.valorLancamentoRemessa = valorLancamentoRemessa;
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
        this.dateEfetivaLancamento = dateEfetivaLancamento;
    }
}
