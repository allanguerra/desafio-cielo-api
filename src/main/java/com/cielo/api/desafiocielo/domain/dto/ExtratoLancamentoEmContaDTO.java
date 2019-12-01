package com.cielo.api.desafiocielo.domain.dto;

import com.cielo.api.desafiocielo.domain.payload.ControleLancamento;
import lombok.Data;

import java.util.Date;

/**
 * DTO para enviar dados para a View.
 * @author allanguerra.
 */
@Data
public class ExtratoLancamentoEmContaDTO {

    private Date dataLancamento;

    private String descricao;

    private Long numero;

    private String situacao;

    private Date dataConfirmacao;

    private String dadosBancarios;

    private Double valorFinal;

    /*
    Constructors
     */

    public ExtratoLancamentoEmContaDTO () {}

    public ExtratoLancamentoEmContaDTO (ControleLancamento controleLancamento) {
        this.dataLancamento = controleLancamento.getDateLancamentoContaCorrenteCliente();
        this.descricao = controleLancamento.getLancamentoContaCorrenteCliente().getNomeTipoOperacao();
        this.numero = controleLancamento.getLancamentoContaCorrenteCliente().getNumeroRemessaBanco();
        this.situacao = controleLancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa();
        this.dataConfirmacao = controleLancamento.getDateEfetivaLancamento();
        this.dadosBancarios = String.format("%s Ag: %s CC: %s",
                controleLancamento.getNomeBanco().trim(),
                controleLancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia(),
                controleLancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente());
        this.valorFinal = controleLancamento.getValorLancamentoRemessa();
    }
}
