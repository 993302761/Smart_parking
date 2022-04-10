package com.example.demo.entiry;
import lombok.Data;
public class park {
    private String park_id;

    public String getPark_id() {
        return park_id;
    }

    public void setPark_id(String park_id) {
        this.park_id = park_id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getIsfree() {
        return isfree;
    }

    public void setIsfree(String isfree) {
        this.isfree = isfree;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    private String place;

    private String isfree;

    private double charge;

    private double latitude;

    private double longitude;

    public park(){}
    public park(String park_id,String place
    ,String isfree,double charge,double latitude,double longitude){
        this.park_id = park_id;
        this.place = place;
        this.isfree = isfree;
        this.charge = charge;
        this.latitude = latitude;
        this.longitude = longitude;
    }



}
