package com.gift;


public class Main {

    public static void main(String[] args) {
	    NewYearGift my = new NewYearGift();
        Candy one = new Candy("candy1", 122, 133, "dark", "chocolate");
        my.addSweet(one);
        Candy two = new Candy("candy2", 22, 33, "dark", "chocolate");
        my.addSweet(two);
        Chocolate three = new Chocolate("choco1", 66, 89090, "white", "choco");
        my.addSweet(three);
        Chocolate four = new Chocolate("choco2", 7, 10, "dark", "extra");
        my.addSweet(four);
        Muffin five = new Muffin("muffin1", 19, 19, "pink", "chocolate, nuts");
        my.addSweet(five);
        Muffin six = new Muffin("muffin2", 10, 1900, "yellow", "eggs");
        my.addSweet(six);

        System.out.println("Our gift after adding sweets");
        System.out.println(my);

        System.out.println("General weight");
        System.out.println(my.returnWeight());

        my.sortByWeight();
        System.out.println("Sorting all sweets by weight...");
        System.out.println(my);

        my.sortBySugar();
        System.out.println("Sorting all sweets by sugar...");
        System.out.println(my);

        System.out.println("Finding sweets...");
        System.out.println(my.findCandy(1,10));

    }
}
