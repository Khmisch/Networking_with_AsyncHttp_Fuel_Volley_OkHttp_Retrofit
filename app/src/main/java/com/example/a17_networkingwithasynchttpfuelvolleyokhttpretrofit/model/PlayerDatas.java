package com.example.a17_networkingwithasynchttpfuelvolleyokhttpretrofit.model;

import java.util.ArrayList;

public class PlayerDatas {
    private String status;
    private String message;
    private ArrayList<Player> data;

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Player> getData() {
        return data;
    }

    public void setData(ArrayList<Player> data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
