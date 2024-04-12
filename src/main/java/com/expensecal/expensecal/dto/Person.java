package com.expensecal.expensecal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Person {
    @NotNull(message = "id cannot be null")
    @JsonProperty("id")
    private Long Id;

    @NotNull(message = "name cannot be null")
    @JsonProperty("name")
    private String Name;

    @NotNull(message = "user_name cannot be null")
    @JsonProperty("user_name")
    private String user_name;

    @NotNull(message = "pwd cannot be null")
    @JsonProperty("pwd")
    private String pwd;

}

