package com.feem.reiss.controller;


import com.feem.reiss.model.UserRole;
import com.feem.reiss.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user-role")
@CrossOrigin("*")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    public ResponseEntity<List<UserRole>> getAll() {
        return new ResponseEntity<>(userRoleService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserRole> save(@RequestBody UserRole userRole) {
        return new ResponseEntity<UserRole>(userRoleService.save(userRole), HttpStatus.CREATED);
    }

    public ResponseEntity<?> delete(@RequestBody Integer id) {
        userRoleService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
