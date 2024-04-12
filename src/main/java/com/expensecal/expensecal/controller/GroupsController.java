package com.expensecal.expensecal.controller;

import com.expensecal.expensecal.dto.GroupsDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/groups")
@Validated
public class GroupsController {

    private List<GroupsDto> groupsList = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Object> createGroup(@Valid @RequestBody GroupsDto groupsDto) {
        groupsList.add(groupsDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(groupsDto);
    }
}





//////////////////

/*
package com.expensecal.expensecal.controller;

import com.expensecal.expensecal.dto.GroupsDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/groups")
@Validated
public class GroupsController {
    // Mock database to store GroupDto objects


    // Endpoint to create a new group
    @RequestMapping(value = "/creategroups", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<List<GroupsDto>> createGroup(@RequestBody List<GroupsDto> groupsDto) {
      //  List<GroupsDto> groups = new ArrayList<>();
      //  groups.addAll(groupsDto);
        return new ResponseEntity<>(groupsDto, HttpStatus.CREATED);
    }
*/

    // Endpoint to retrieve all groups
  /*  @GetMapping
    public ResponseEntity<List<GroupsDto>> getAllGroups() {
        return new ResponseEntity<>(groups, HttpStatus.OK);
    }

    // Endpoint to retrieve a group by ID
    @GetMapping("/{id}")
    public ResponseEntity<GroupsDto> getGroupById(@PathVariable Long id) {
        for (GroupsDto groupsDto : groups) {
            if (groupsDto.getId().equals(id)) {
                return new ResponseEntity<>(groupsDto, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint to update a group by ID
    @PutMapping("/{id}")
    public ResponseEntity<GroupsDto> updateGroup(@PathVariable Long id, @RequestBody GroupsDto updatedGroupsDto) {
        for (GroupsDto groupsDto : groups) {
            if (groupsDto.getId().equals(id)) {
                groupsDto.setName(updatedGroupDto.getName());
                groupsDto.setPerson(updatedGroupDto.getPerson());
                return new ResponseEntity<>(groupsDto, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint to delete a group by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroup(@PathVariable Long id) {
        for (GroupsDto groupsDto : groups) {
            if (groupsDto.getId().equals(id)) {
                groups.remove(groupsDto);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
} */




