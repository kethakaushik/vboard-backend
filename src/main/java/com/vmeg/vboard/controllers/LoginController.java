package com.vmeg.vboard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/registration")
public class LoginController {

    @GetMapping()
    public String login() {
        return "login";
    }
}

