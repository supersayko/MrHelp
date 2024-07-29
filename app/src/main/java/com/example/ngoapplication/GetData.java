package com.example.ngoapplication;

public class GetData {
    public GetData(String bkName, String categ, String pLoc, String foodName, String pLocation, String quantity) {
        this.bkName = bkName;
        this.categ = categ;
        this.pLoc = pLoc;
        this.foodName = foodName;
        this.pLocation = pLocation;
        this.quantity = quantity;
    }

    String bkName, categ, pLoc, foodName, pLocation, quantity;

    public GetData() {
    }

    public String getFoodName() {
        return foodName;
    }

    public String getpLocation() {
        return pLocation;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getBkName() {
        return bkName;
    }

    public String getCateg() {
        return categ;
    }

    public String getpLoc() {
        return pLoc;
    }
}