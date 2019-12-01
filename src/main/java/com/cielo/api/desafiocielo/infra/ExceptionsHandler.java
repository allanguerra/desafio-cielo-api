package com.cielo.api.desafiocielo.infra;

import com.cielo.api.desafiocielo.infra.exceptions.DataNotFoundException;
import com.cielo.api.desafiocielo.infra.exceptions.FileException;
import com.cielo.api.desafiocielo.infra.exceptions.JsonNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;

/**
 * Camada de gerenciamento de excessões da aplicação.
 * @author allanguerra
 */
@ControllerAdvice
public class ExceptionsHandler {

    private static final Logger log = LoggerFactory.getLogger(ExceptionHandler.class);

    @ExceptionHandler(FileException.class)
    public ResponseEntity<StandardError> resourceNotFound(FileException e, HttpServletRequest request){
        StandardError err = new StandardError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), Calendar.getInstance().getTimeInMillis());
        log.error(String.format("s% - s% (s%)", e.getErrorType().getErrorCode(), e.getErrorType().getDescription(), e.getCause().getMessage()));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }

    @ExceptionHandler(JsonNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(JsonNotFoundException e, HttpServletRequest request){
        StandardError err = new StandardError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), Calendar.getInstance().getTimeInMillis());
        log.error(String.format("s% - s% (s%)", e.getErrorType().getErrorCode(), e.getErrorType().getDescription(), e.getCause().getMessage()));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(DataNotFoundException e, HttpServletRequest request){
        StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), Calendar.getInstance().getTimeInMillis());
        log.error(String.format("s% - s% (s%)", e.getErrorType().getErrorCode(), e.getErrorType().getDescription(), e.getCause().getMessage()));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
}
