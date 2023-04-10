package com.feem.reiss.controller;

import com.feem.reiss.model.User;
import com.feem.reiss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        return new ResponseEntity<User>(userService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        return new ResponseEntity<User>(userService.save(user), HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/findByName")
    public ResponseEntity<List<User>> getByName(@RequestBody User user) {
        System.out.println(user.getName());
        return new ResponseEntity<List<User>>(userService.findByName(user.getName()), HttpStatus.OK);
    }

}
