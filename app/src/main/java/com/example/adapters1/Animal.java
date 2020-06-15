package com.example.adapters1;

public class Animal {
    private String name;
    private int pictrueID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPictrueID() {
        return pictrueID;
    }

    public void setPictrueID(int pictrueID) {
        this.pictrueID = pictrueID;
    }

    public Animal() {
    }

    public Animal(String name, int pictrueID) {
        this.name = name;
        this.pictrueID = pictrueID;
    }
}
