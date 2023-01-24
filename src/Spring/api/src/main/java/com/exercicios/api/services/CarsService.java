package com.exercicios.api.services;

import com.exercicios.api.models.CarModel;
import com.exercicios.api.repositories.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CarsService {

    @Autowired
    private CarsRepository carsRepository;

    public List<CarModel> getCars() {
        return carsRepository.findAll();
    }

    public void deleteCar(Long id) {
        carsRepository.deleteById(id);
    }

    public void updateCar(Long id, CarModel car) {
        carsRepository.findById(id).map(carModel -> {
            carModel.setNome(car.getNome());
            carModel.setFabricante(car.getFabricante());
            carModel.setDataFabricacao(car.getDataFabricacao());
            carModel.setValor(car.getValor());
            carModel.setAnoModelo(car.getAnoModelo());
            return carsRepository.save(carModel);
        });
    }
}
