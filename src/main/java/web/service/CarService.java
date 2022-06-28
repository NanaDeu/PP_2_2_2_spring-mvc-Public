package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> getCarsList() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("George1", "BMW", 1));
        carsList.add(new Car("George2", "BMW", 2));
        carsList.add(new Car("George3", "BMW", 3));
        carsList.add(new Car("George4", "BMW", 4));
        carsList.add(new Car("George5", "BMW", 5));
        return carsList;
    }

    public static List<Car> getThatManyCars(int amount) {
        return CarService.getCarsList().subList(0, amount);
    }

}