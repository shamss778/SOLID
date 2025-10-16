package com.directi.training.srp.exercise.refactoring;
import com.directi.training.srp.exercise.Car;

public class CarFormatter {
    
    private final Car _car;

    public CarFormatter(Car car) {
        _car = car;
    }

    public String formatCar() {
        return _car.getBrand() + " " + _car.getModel();
    }
}
