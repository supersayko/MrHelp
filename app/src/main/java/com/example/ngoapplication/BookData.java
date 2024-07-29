package com.example.ngoapplication;

public class BookData {
    String categ, bkName, pTme, pDte, pLoc;

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public String getBkName() {
        return bkName;
    }

    public void setBkName(String bkName) {
        this.bkName = bkName;
    }

    public String getpTme() {
        return pTme;
    }

    public void setpTme(String pTme) {
        this.pTme = pTme;
    }

    public String getpDte() {
        return pDte;
    }

    public void setpDte(String pDte) {
        this.pDte = pDte;
    }

    public String getpLoc() {
        return pLoc;
    }

    public void setpLoc(String pLoc) {
        this.pLoc = pLoc;
    }

    public BookData() {
    }

    public BookData(String categ, String bkName, String pTme, String pDte, String pLoc) {
        this.categ = categ;
        this.bkName = bkName;
        this.pTme = pTme;
        this.pDte = pDte;
        this.pLoc = pLoc;
    }
}
