package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world Invex");
    }

}
