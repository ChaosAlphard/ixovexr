package com.ilirus.ixovexr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping("home")
    public String homePage() {
        return "Hello World!";
    }
}
