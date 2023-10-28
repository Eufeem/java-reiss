package com.feem.reiss.controller;

import com.feem.reiss.model.Role;
import com.feem.reiss.model.RolePageable;
import com.feem.reiss.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
@CrossOrigin("*")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public ResponseEntity<List<Role>> getAll() {
        return new ResponseEntity<>(roleService.getAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Role> findById(@PathVariable Integer id) {
        return new ResponseEntity<>(roleService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Role> save(@RequestBody Role role) {
        return new ResponseEntity<>(roleService.save(role), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Role> update(@RequestBody Role role) {
        return new ResponseEntity<>(roleService.save(role), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        roleService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/paginas")
    public Page<Role> getRolesPage(Pageable pageable) {
        return roleService.getRolesPage(pageable);
    }

    @GetMapping("/pageQuery/{text}/{page}/{size}")
    public Page<Role> getRolesPageQuery(@PathVariable String text, @PathVariable int page, @PathVariable int size) {
        Pageable pageable = PageRequest.of(page, size);
        return roleService.getRolesPageQuery(text, pageable);
    }
}
