package com.paranyak;

public class Flower {

    protected  FlowerSpec spec;

    public Flower (FlowerSpec spec) {
        this.spec = spec;
    }

    public String getType() {
        return spec.getType();
    }

    public double getPrice() {
        return spec.getPrice();
    }

    public double getLength() {
        return spec.getLength();
    }

    public FlowerColor getColor() {
        return spec.getColor();
    }

    public boolean isFresh() {
        return spec.isFresh();
    }
    public FlowerSpec getSpec(){
        return spec;
    }

    public String toString() {
        return "Type: " + getType() + ", Price:  " + String.valueOf(getPrice()) + ", " + getColor() + ", Fresh: " + String.valueOf(isFresh()) + ", Height: " + String.valueOf(getLength());
    }

}
