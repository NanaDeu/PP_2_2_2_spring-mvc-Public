package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String ownerName;
    private String model;
    private int series;
    List<Car> carsList;

    @Override
    public String toString() {
        return "Car { Owner: " + ownerName
                + ", Model: " + model
                + ", Series: " + series
                + " }";
    }

    public Car(String ownerName, String model, int series) {
        this.ownerName = ownerName;
        this.model = model;
        this.series = series;
    }

    public static List<Car> getCarsList() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("George1", "BMW", 1));
        carsList.add(new Car("George2", "BMW", 2));
        carsList.add(new Car("George3", "BMW", 3));
        carsList.add(new Car("George4", "BMW", 4));
        carsList.add(new Car("George5", "BMW", 5));
        return carsList;
    }

    public void setCarsList(List<Car> carsList) {
        this.carsList = carsList;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}
