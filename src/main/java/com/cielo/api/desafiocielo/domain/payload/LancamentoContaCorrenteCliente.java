package com.cielo.api.desafiocielo.domain.payload;

import lombok.Data;

import java.util.List;

/**
 * Mapeamento do Sistema Legado - Lançamentos na Conta Corrente do Cliente.
 * @author allanguerra
 */
@Data
public class LancamentoContaCorrenteCliente {

    private Long numeroRemessaBanco;

    private String nomeSituacaoRemessa;

    private String nomeTipoOperacao;

    private DadosDomicilioBancario dadosDomicilioBancario;

    private List<DadosAnaliticoLancamentoFinanceiroCliente> dadosAnaliticoLancamentoFinanceiroCliente;

    /*
    Constructors
     */

    public LancamentoContaCorrenteCliente() {}

    public LancamentoContaCorrenteCliente(Long numeroRemessaBanco, String nomeSituacaoRemessa, String nomeTipoOperacao, DadosDomicilioBancario dadosDomicilioBancario) {
        this.numeroRemessaBanco = numeroRemessaBanco;
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
        this.nomeTipoOperacao = nomeTipoOperacao;
        this.dadosDomicilioBancario = dadosDomicilioBancario;
    }
}
