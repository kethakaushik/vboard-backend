package com.vmeg.vboard.controllers;

import com.vmeg.vboard.models.Users;
import com.vmeg.vboard.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/registration")
public class RegistrationController {

    @Autowired
    private UsersService usersService;

    @GetMapping()
    public String registration() {
        return "registration";
    }

    @PostMapping()
    public String registerUser(Users users, Model model) {
        usersService.save(users);
        return "redirect:/login";
    }
}

