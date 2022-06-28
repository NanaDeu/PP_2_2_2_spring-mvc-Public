package web.model;

public class Car {
    private String ownerName;
    private String model;
    private int series;

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
