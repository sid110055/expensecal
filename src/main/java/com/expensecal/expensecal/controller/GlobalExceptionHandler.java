package com.expensecal.expensecal.controller;

import com.expensecal.expensecal.dto.ValidationExceptionDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ValidationExceptionDetails>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        List<ValidationExceptionDetails> validationErrors = new ArrayList<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            ValidationExceptionDetails validationError = new ValidationExceptionDetails(
                    error.getField(),
                    error.getDefaultMessage(),
                    error.getRejectedValue()
            );
            validationErrors.add(validationError);
        });
        return ResponseEntity.badRequest().body(validationErrors);
    }
}
