package com.example.ngoapplication;

public class VolunteerData {
    String name, number, mail, city, pin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public VolunteerData() {
    }

    public VolunteerData(String name, String number, String mail, String city, String pin) {
        this.name = name;
        this.number = number;
        this.mail = mail;
        this.city = city;
        this.pin = pin;
    }
}
