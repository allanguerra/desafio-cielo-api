package com.cielo.api.desafiocielo.legacy;

import com.cielo.api.desafiocielo.domain.payload.ExtratoLancamentoCliente;

/**
 * Facede de integração com sistema legado.
 * @author allanguerra
 */
public interface LegacyFacade {

    public ExtratoLancamentoCliente listarExtratoDeLancamentos();
}
