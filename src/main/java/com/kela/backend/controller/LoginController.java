package com.kela.backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {


    @GetMapping(value = "/login")
    public Object login() {
        return "Login";
    }

    @GetMapping(value = "/signup")
    public String signup() {
        return "Sign up";
    }

    @GetMapping(value = "/logout")
    public String logout() {
        return "Logout";
    }

    @GetMapping(value = "/home")
    public String home() {
        return "Home";
    }

}
