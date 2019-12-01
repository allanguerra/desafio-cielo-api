package com.cielo.api.desafiocielo.infra.exceptions.enums;

import lombok.Getter;

/**
 * Enumerador para erros.
 * @author allanguerra
 */
@Getter
public enum ErrorType {

    JS01("JS01", "Json Not Found Exception", "Não foi fazer o mapeamento do arquivo JSON."),
    FL01("FL01", "File Exception", "Não foi possível ler o arquivo."),
    FL02("FL02", "File Exception", "O caminho especificado não foi encontrado."),
    DT01("DT01", "Data Not Found Exception", "Objeto sem dados.");

    private String errorCode;
    private String errorType;
    private String description;

    /*
    Constructor
     */

    private ErrorType (String errorCode, String errorType, String description) {
        this.errorCode = errorCode;
        this.errorType = errorType;
        this.description = description;
    }

    /*
    Public Methods
     */

    public static ErrorType toEnum (String errorCode) {
        if (errorCode == null) {
            return null;
        }
        for (ErrorType errorType : ErrorType.values()) {
            if(errorType.getErrorCode().equals(errorCode)) {
                return errorType;
            }
        }
        return null;
    }
}
