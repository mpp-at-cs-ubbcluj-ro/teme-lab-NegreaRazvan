package com.beginsecure;



public class Car implements Identifiable<Integer> {
    private String manufacturer, model;
    private int year;
    private int id;

    public Car(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    @Override
    public String toString() {
        return "Id=" + id + " " + manufacturer + ' ' + model + ' ' + year ;
    }


    @Override
    public void setId(Integer integer) {
        this.id=integer;
    }

    @Override
    public Integer getId() {
        return id;
    }
}
