package com.exercicios.api.controller;

import com.exercicios.api.dto.CarsDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CarsController {

    @RequestMapping("/cars")
    public void printRequest(@RequestBody CarsDTO request) {
        System.out.println(request);
    }
}
