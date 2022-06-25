package web.service;

import web.model.Car;

import java.util.List;

public class CarService {

    public static List<Car> getThatManyCars(int amount) {
        return Car.getCarsList().subList(0, amount);
    }

}