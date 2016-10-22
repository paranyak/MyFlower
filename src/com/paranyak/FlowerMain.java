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
        System.out.println("Finding black flower, price - 10.0, fresh, length - 16.0, type - rose");
        System.out.println(Arrays.toString(bucket.search(findFlower))); /// [Type: rose, Price:  10.0, Black color, Fresh: true, Height: 16.0]

        FlowerSpec myF3 = new FlowerSpec();
        myF3.setPrice(30.0);
        myF3.setColor(FlowerColor.WHITE);
        myF3.setFresh(false);
        myF3.setLength(10.0);
        myF3.setType("rose2");

        Flower rose2 = new Flower(myF3);
        bucket.addFlower(rose2);

        FlowerSpec findFlower2 = new FlowerSpec();
        findFlower2.setPrice(10000.0);
        findFlower2.setColor(FlowerColor.WHITE);
        System.out.println("Finding white flower, that costs 10000.0...");
        System.out.println(Arrays.toString(bucket.search(findFlower2))); /// []

        FlowerSpec findFlower3 = new FlowerSpec();
        System.out.println("Finding pink flower...");
        findFlower3.setColor(FlowerColor.PINK); ///[Type: mak, Price:  12.0, Pink color, Fresh: true, Height: 15.0]

        System.out.println(Arrays.toString(bucket.search(findFlower3)));
    }
}
