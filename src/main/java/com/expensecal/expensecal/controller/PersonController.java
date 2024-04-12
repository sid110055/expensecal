package com.expensecal.expensecal.controller;

import com.expensecal.expensecal.dto.Person;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Person")
@Validated

public class PersonController {

    @PostMapping
    public ResponseEntity<Object> saveExample(@RequestBody @Valid Person person) {
        return new ResponseEntity(person, HttpStatus.CREATED);


    }
}