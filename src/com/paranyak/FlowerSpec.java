package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 10/18/2016.
 */
public class FlowerSpec {
    protected FlowerColor color = FlowerColor.NOCOLOR;
    protected double length = -1.0;
    protected Boolean fresh = null;
    protected double price= -1.0;
    protected String type = "no name";

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

        if((color != otherSpec.color) && (otherSpec.color != FlowerColor.NOCOLOR)) {
            return false;
        }
        if((type != otherSpec.type) && (otherSpec.type != "no name")){
            return false;
        }
        if((length != otherSpec.length) && (otherSpec.length != -1.0)){
            return false;
        }
        if((price != otherSpec.price) && (otherSpec.price != -1.0)){
            return false;
        }
        if((fresh != otherSpec.fresh) && (otherSpec.fresh != null)){
            return false;
        }
        return  true;
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
