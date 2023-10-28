package com.feem.reiss.controller;

import com.feem.reiss.model.Permission;
import com.feem.reiss.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("permission")
@CrossOrigin("*")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping
    public ResponseEntity<List<Permission>> getAll() {
        return new ResponseEntity<>(permissionService.getAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Permission> findById(@PathVariable Integer id) {
        return new ResponseEntity<>(permissionService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Permission> save(@RequestBody Permission permission) {
        return new ResponseEntity<>(permissionService.save(permission), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Permission> update(@RequestBody Permission permission) {
        return new ResponseEntity<>(permissionService.save(permission), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        permissionService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
