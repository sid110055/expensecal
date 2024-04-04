package com.expensecal.expensecal.controller;

import com.expensecal.expensecal.dto.Example;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eg")
public class ExampleController {

    @PostMapping
    public ResponseEntity<Object> saveExample(@Valid @RequestBody Example example, Errors errors){
        if(errors.hasErrors()){
            return new ResponseEntity<>(errors.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(example, HttpStatus.CREATED);
    }
}
