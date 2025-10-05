package Entities;

public class Plane {
    private String brand;
    private String model;
    private int year;
    private int capacity;

    public Plane(String brand, String model, int year, int capacity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}