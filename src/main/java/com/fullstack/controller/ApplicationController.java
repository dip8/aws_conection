package com.fullstack.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Well come to Fullstack Java Developer");
    }

    @GetMapping("/address")
    public ResponseEntity<String> sayaddress(){
        return ResponseEntity.ok("Pune,India");
    }
}
