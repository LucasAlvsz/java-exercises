package com.exercicios.api.controller;

import com.exercicios.api.dto.CarsDTO;
import com.exercicios.api.models.CarModel;
import com.exercicios.api.services.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarsController {

    @Autowired
    private CarsService carsService;

    @RequestMapping("/cars")
    public void printRequest(@RequestBody CarsDTO request) {
        System.out.println(request);
    }

    @GetMapping("/cars")
    public List<CarModel> getCars() {
        return carsService.getCars();
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCar(@PathVariable Long id) {
        carsService.deleteCar(id);
    }

    @PutMapping("/cars/{id}")
    public void updateCar(@PathVariable Long id, @RequestBody CarModel car) {
        carsService.updateCar(id, car);
    }
}
