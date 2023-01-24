package com.exercicios.api.repositories;

import com.exercicios.api.models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<CarModel, Long> {

}
