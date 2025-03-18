package com.rebellion.blogging_platform_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("")
public class HomeController {

    @GetMapping("")
    public String getHomePage() {
        return new String("<h1 style=\"text-align: center; color: green;\">Server is up!</h1>");
    }
    
}
