package com.security.SpringBootRestAPIOAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthController {

    @GetMapping(value="/demo")
    public String demo(){
        return "Welcome to OAuth demo";
    }
}
