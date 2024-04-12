package com.expensecal.expensecal.dto;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class PersonsDto implements Serializable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonsDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
