package com.example.ngoapplication;

public class ClothData {
    String cloth, size, pTime, pDate, pLocation;

    public String getCloth() {
        return cloth;
    }

    public void setCloth(String cloth) {
        this.cloth = cloth;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    public String getpLocation() {
        return pLocation;
    }

    public void setpLocation(String pLocation) {
        this.pLocation = pLocation;
    }

    public ClothData() {
    }

    public ClothData(String cloth, String size, String pTime, String pDate, String pLocation) {
        this.cloth = cloth;
        this.size = size;
        this.pTime = pTime;
        this.pDate = pDate;
        this.pLocation = pLocation;
    }
}