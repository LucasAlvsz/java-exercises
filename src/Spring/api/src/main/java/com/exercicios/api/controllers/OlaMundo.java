package com.exercicios.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OlaMundo {

    @GetMapping("/ola")
    public String ola() {
        return "Olá Spring";
    }
}
