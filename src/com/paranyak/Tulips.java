package com.paranyak;

public class Tulips extends Flower{
    public Tulips(String name, double size, double price, String color, double fresh){
        this.setPrice(price);
        this.setColor(color);
        this.setSize(size);
        this.setFresh(fresh);
        this.setName(name);
    }
}
