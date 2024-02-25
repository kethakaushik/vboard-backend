package com.vmeg.vboard.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @GetMapping("test")
    public ResponseEntity<?> test(){
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    }
}
