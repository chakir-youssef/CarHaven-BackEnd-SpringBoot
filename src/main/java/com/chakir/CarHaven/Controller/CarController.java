package com.chakir.CarHaven.Controller;

import com.chakir.CarHaven.Entity.Car;
import com.chakir.CarHaven.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")

public class CarController {


    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getAllCars() {
        return this.carService.getAllCars();
    }
    
    @PostMapping
    public void addCar(@RequestBody Car car){
        this.carService.addCar(car);
    }



}
