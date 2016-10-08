package com.gift;

public class Muffin extends Sweets{
    public Muffin(String name, double weight, double sugar, String color, String composition){
        this.setColor(color);
        this.setName(name);
        this.setComposition(composition);
        this.setSugar(sugar);
        this.setWeight(weight);
    }
}
