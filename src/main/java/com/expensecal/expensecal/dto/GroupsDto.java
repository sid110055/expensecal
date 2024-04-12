package com.expensecal.expensecal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupsDto {
    @JsonProperty("id")
    @NotNull(message = "Id cannot be null")
    private Long id;

    @JsonProperty("name")
    @NotNull(message = "Name cannot be null")
    @Size(min = 1, max = 50, message = "Name must be between 1 and 50 characters")
    private String name;

    @JsonProperty("person")
    @Valid // Enable validation for nested objects
    public List<PersonsDto> person;
}




//////////////////////////////////////////////////////////






























/*package com.expensecal.expensecal.dto;

public class GroupsDto {



}*/


/*
package com.expensecal.expensecal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class GroupsDto {
    @NotNull(message = "id cannot be null")
    @JsonProperty("id")
    private String Id;

    @NotNull(message = "name cannot be null")
    @JsonProperty("name")
    private String Name;

    @NotNull(message = "Person cannot be null")
    @JsonProperty("person")
    private List<PersonsDto> person;


}*/
