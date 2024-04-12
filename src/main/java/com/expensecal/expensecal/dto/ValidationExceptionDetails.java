package com.expensecal.expensecal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ValidationExceptionDetails {
    private String field;
    private String errorMessage;
    private Object rejectedValue;
}
