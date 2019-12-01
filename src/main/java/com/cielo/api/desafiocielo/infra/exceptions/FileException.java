package com.cielo.api.desafiocielo.infra.exceptions;

import com.cielo.api.desafiocielo.infra.exceptions.enums.ErrorType;
import lombok.Getter;

/**
 * Excessão para erros de leitura do arquivo .json.
 * @author allanguerra
 */
@Getter
public class FileException extends RuntimeException {

    private ErrorType errorType;

    /*
    Constructors
     */

    public FileException(ErrorType errorType, String msg) {
        super(msg);
        this.errorType = errorType;
    }

    public FileException(ErrorType errorType, String msg, Throwable cause) {
        super(msg, cause);
        this.errorType = errorType;
    }
}
