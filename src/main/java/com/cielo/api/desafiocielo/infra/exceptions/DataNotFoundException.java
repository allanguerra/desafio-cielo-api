package com.cielo.api.desafiocielo.infra.exceptions;

import com.cielo.api.desafiocielo.infra.exceptions.enums.ErrorType;
import lombok.Getter;

@Getter
public class DataNotFoundException extends RuntimeException {

    private ErrorType errorType;

    /*
    Constructors
     */

    public DataNotFoundException (ErrorType errorType, String msg) {
        super(msg);
        this.errorType = errorType;
    }

    public DataNotFoundException (ErrorType errorType, String msg, Throwable cause) {
        super(msg, cause);
        this.errorType = errorType;
    }
}
