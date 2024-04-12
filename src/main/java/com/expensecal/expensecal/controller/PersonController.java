package com.expensecal.expensecal.controller;


import com.expensecal.expensecal.dto.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Person")

public class PersonController {

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id,@RequestBody Person person) {

        if (person != null) {
            return new ResponseEntity<>(person, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        // Logic to create a new person
        // You can implement this logic as per your requirements
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id, @RequestBody Person person) {
        // Logic to update an existing person
        // You can implement this logic as per your requirements
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id) {
        // Logic to delete an existing person
        // You can implement this logic as per your requirements
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
