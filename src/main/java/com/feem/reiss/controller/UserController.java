package com.feem.reiss.controller;

import com.feem.reiss.model.User;
import com.feem.reiss.service.UserService;
import com.feem.reiss.utils.UserExcelExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        System.out.println(user.getFirstName());
        return new ResponseEntity<List<User>>(userService.findByName(user.getFirstName()), HttpStatus.OK);
    }

    @GetMapping("/xlxs")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);

        List<User> listUsers = userService.getAll();
        UserExcelExporter excelExporter = new UserExcelExporter(listUsers);

        excelExporter.export(response);
    }


}
