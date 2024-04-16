package web.dao;

public class Car {

    private String model;

    private String color;

    private int serialNumber;

    public Car() {
    }

    public Car(String model, String color, int serialNumber) {
        this.model = model;
        this.color = color;
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
