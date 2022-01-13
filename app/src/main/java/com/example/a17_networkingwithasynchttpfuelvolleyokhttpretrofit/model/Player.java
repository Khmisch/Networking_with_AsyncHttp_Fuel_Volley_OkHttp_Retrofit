package com.example.a17_networkingwithasynchttpfuelvolleyokhttpretrofit.model;

import java.io.Serializable;

public class Player implements Serializable {

    public int tennis_image;
    public String tennis_name;
    public String tennis_location;

    public Player(int tennis_image, String tennis_name, String tennis_location) {
        this.tennis_image = tennis_image;
        this.tennis_name = tennis_name;
        this.tennis_location = tennis_location;
    }

    public int getTennis_image() {
        return tennis_image;
    }

    public String getCountry() {
        return tennis_location;
    }
    public String getCity() {
        return tennis_location;
    }

    public String getTennis_name() {
        return tennis_name;
    }

    public void setTennis_image(int tennis_image) {
        this.tennis_image = tennis_image;
    }

    public void setCountry(String tennis_location) {
        this.tennis_location = tennis_location;
    }

    public void setCity(String tennis_location) {
        this.tennis_location = tennis_location;
    }

    public void setTennis_name(String tennis_name) {
        this.tennis_name = tennis_name;
    }
}

