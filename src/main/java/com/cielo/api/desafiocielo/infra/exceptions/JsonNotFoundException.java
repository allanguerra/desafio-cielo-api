package com.cielo.api.desafiocielo.infra.exceptions;

import com.cielo.api.desafiocielo.infra.exceptions.enums.ErrorType;
import lombok.Getter;

@Getter
public class JsonNotFoundException extends RuntimeException {

    private ErrorType errorType;

    /*
    Constructors
     */

    public JsonNotFoundException (ErrorType errorType, String msg) {
        super(msg);
        this.errorType = errorType;
    }

    public JsonNotFoundException (ErrorType errorType ,String msg, Throwable cause) {
        super(msg, cause);
        this.errorType = errorType;
    }
}
