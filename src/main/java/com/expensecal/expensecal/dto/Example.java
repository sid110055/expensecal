package com.expensecal.expensecal.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Example {

    @NotNull(message = "person_id cannot be null")
    @JsonProperty("person_id")
    private String personId;

    @NotNull(message = "person_name cannot be null")
    @JsonProperty("person_name")
    private String personName;

    @NotNull(message = "group_name cannot be null")
    @JsonProperty("group_name")
    private String groupName;
}
