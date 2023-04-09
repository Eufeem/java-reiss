package com.feem.reiss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/a")
    public String getMessage() {
        return  "hi";
    }
}
