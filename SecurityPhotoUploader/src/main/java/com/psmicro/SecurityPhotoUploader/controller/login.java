package com.psmicro.SecurityPhotoUploader.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {

    @GetMapping("/home")
    public String home(){
        return "This is Home Page";
    }

    @GetMapping("/upload")
    public String admin(){
        return "This is admin page";
    }
}
