package com.cielo.api.desafiocielo.infra;

import lombok.Data;

/**
 * Objeto para abstração de erros causados na aplicação.
 * @author allanguerra
 */
@Data
public class StandardError {

    private Integer status;

    private String message;

    private Long timeStamp;

    /*
    Constructors
     */

    public StandardError() {}

    public StandardError(Integer status, String message, Long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }
}
