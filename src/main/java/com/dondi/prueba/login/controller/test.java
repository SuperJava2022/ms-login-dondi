package com.dondi.prueba.login.controller;

import org.springframework.web.bind.annotation.RestController;

import com.dondi.prueba.login.entity.Token;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class test {

    @GetMapping("/prueba")
    public String getMethodName() {
        return new String("Simulo MS Login!!");
    }

    @PostMapping("/login")
    public Token postMethodName(@RequestBody String entity) {
        Token token = new Token();
        if (entity.equals("Admin")) {
            token.setToken("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
            return token;
        }
        token.setToken("BBCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
        return token;

    }

}
