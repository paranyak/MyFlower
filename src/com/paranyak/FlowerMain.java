package com.paranyak;

import java.util.Arrays;


public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        FlowerSpec myF = new FlowerSpec();
        myF.setPrice(12.0);
        myF.setColor(FlowerColor.PINK);
        myF.setFresh(true);
        myF.setLength(15.0);
        myF.setType("mak");

        FlowerSpec myF2 = new FlowerSpec();
        myF2.setPrice(10.0);
        myF2.setColor(FlowerColor.BLACK);
        myF2.setFresh(true);
        myF2.setLength(16.0);
        myF2.setType("rose");

        Flower mak = new Flower(myF);
        Flower rose = new Flower(myF2);
        bucket.addFlower(mak);
        bucket.addFlower(rose);

        FlowerSpec findFlower = new FlowerSpec();
        findFlower.setPrice(10.0);
        findFlower.setColor(FlowerColor.BLACK);
        findFlower.setFresh(true);
        findFlower.setLength(16.0);
        findFlower.setType("rose");
        System.out.println(Arrays.toString(bucket.search(findFlower)));

    }
}
