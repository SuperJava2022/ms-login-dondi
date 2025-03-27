package com.dondi.prueba.login.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class test {

    @GetMapping("/prueba")
    public String getMethodName() {
        return new String("Simulo MS Login!!");
    }

}
