package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 10/18/2016.
 */
public class FlowerSpec {
    protected FlowerColor color;
    protected double length;
    protected boolean fresh;
    protected double price;
    protected String type;

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void setType(String type) {
        this.type = type;
    }


    public boolean matches(FlowerSpec otherSpec){
        if(color != otherSpec.color) {
            return false;
        }
        if((type != null)&& (!type.equals(otherSpec.type))){
            return false;
        }
        if(length != otherSpec.length){
            return false;
        }
        if(price != otherSpec.price){
            return false;
        }
        if(fresh != otherSpec.fresh){
            return false;
        }
            return true;
    }


    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
    public double getLength() {
        return length;
    }
    public FlowerColor getColor() {
        return color;
    }
    public boolean isFresh() {
        return fresh;
    }
}
