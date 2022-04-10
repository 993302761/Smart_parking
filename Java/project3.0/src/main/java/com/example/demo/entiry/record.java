package com.example.demo.entiry;

public class record {
    private String License_plate;
    private String color;
    private String time;
    private String id;
    private boolean isusing;

    public boolean getIsusing() {
        return isusing;
    }

    public void setIsusing(boolean isusing) {
        this.isusing = isusing;
    }

    public String getLicense_plate() {
        return License_plate;
    }

    public void setLicense_plate(String license_plate) {
        License_plate = license_plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
