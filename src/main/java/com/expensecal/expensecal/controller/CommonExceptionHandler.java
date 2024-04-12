package com.expensecal.expensecal.controller;

import com.expensecal.expensecal.dto.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErrorResponse>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        List<ErrorResponse> validationErrors = new ArrayList<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            ErrorResponse validationError = new ErrorResponse(
                    error.getField(),
                    error.getDefaultMessage(),
                    error.getRejectedValue()
            );
            validationErrors.add(validationError);
        });
        return ResponseEntity.badRequest().body(validationErrors);
    }
}
