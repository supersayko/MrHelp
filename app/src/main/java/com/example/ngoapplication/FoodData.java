package com.example.ngoapplication;

public class FoodData {
    String foodName , quantity, pTime, pDate, pLocation;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
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

    public FoodData() {
    }

    public FoodData(String foodName, String quantity, String pTime, String pDate, String pLocation) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.pTime = pTime;
        this.pDate = pDate;
        this.pLocation = pLocation;
    }
}
