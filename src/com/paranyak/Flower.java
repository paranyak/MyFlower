package com.paranyak;

public class Flower {
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return name;
    }

    private double size = 0;

    private double price =0;

    private String color = "";

    public double getFresh() {
        return fresh;
    }

    public void setFresh(double fresh) {
        this.fresh = fresh;
    }

    private double fresh = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String name = "";

}
