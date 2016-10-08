package com.gift;

public class Candy extends Sweets{
    public Candy(String name, double weight, double sugar, String color, String composition){
        this.setColor(color);
        this.setName(name);
        this.setComposition(composition);
        this.setSugar(sugar);
        this.setWeight(weight);
    }
}
