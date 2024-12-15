

package com.kfs.kfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

@CrossOrigin(origins = "http://localhost:5173")
public class ContentController {

    @GetMapping("/login")
    public String login(){
        return "Login";
    }
}
