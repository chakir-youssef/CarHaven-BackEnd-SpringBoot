package com.chakir.CarHaven.Entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "cars")
public class Car {

    @Id

    private String id;

    private int year;

    private String make;

    private String model;

    private String body_style;

    private String state;

    private double price;

    private String description;

    private int horsepower;

    private int miles;

    private String transmission;

    private String image_url;

    public Car() {
    }

    public Car(String id, int year, String make, String model, String body_style, String state, double price, String description, int horsepower, int miles, String transmission, String image_url) {
        this.id = id;
        this.year = year;
        this.make = make;
        this.model = model;
        this.body_style = body_style;
        this.state = state;
        this.price = price;
        this.description = description;
        this.horsepower = horsepower;
        this.miles = miles;
        this.transmission = transmission;
        this.image_url = image_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBody_style() {
        return body_style;
    }

    public void setBody_style(String body_style) {
        this.body_style = body_style;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
