package com.chakir.CarHaven.Service;

import com.chakir.CarHaven.Entity.Car;
import com.chakir.CarHaven.Repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CarService {


    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }



    public void addCar(Car car){
        car.setId(UUID.randomUUID().toString().split("-")[0]);
        carRepository.save(car);
    }
}
