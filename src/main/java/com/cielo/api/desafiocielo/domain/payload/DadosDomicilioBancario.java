package com.cielo.api.desafiocielo.domain.payload;

import lombok.Data;

@Data
public class DadosDomicilioBancario {

    private String codigoBanco;

    private String numeroAgencia;

    private String numeroContaCorrente;

    /*
    Constructors
     */

    public DadosDomicilioBancario() {}

    public DadosDomicilioBancario(String codigoBanco, String numeroAgencia, String numeroContaCorrente) {
        this.codigoBanco = codigoBanco;
        this.numeroAgencia = numeroAgencia;
        this.numeroContaCorrente = numeroContaCorrente;
    }
}
