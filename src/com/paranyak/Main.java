package com.paranyak;

public class Main {

    public static void main(String[] args) {
        Bouquet korzinochka = new Bouquet();
        Tulips flwr1 = new Tulips("Tulip1", 12, 44, "black", 5);
        korzinochka.addFlower(flwr1);
	    Chamomile flwr2 = new Chamomile("Chamomile1", 10, 30, "while", 7);
        korzinochka.addFlower(flwr2);
        Chamomile flwr3 = new Chamomile("Chamomile2",12, 23, "while", 2);
        korzinochka.addFlower(flwr3);
        Chamomile flwr4 = new Chamomile("Chamomile3",19, 30, "while", 10);
        korzinochka.addFlower(flwr4);
        Tulips flwr5 = new Tulips("Tulip2",12, 74, "yellow", 3);
        korzinochka.addFlower(flwr5);
        Roses flwr6 = new Roses("Rose1", 30, 50, "pink", 10);
        korzinochka.addFlower(flwr6);
        Roses flwr7 = new Roses ("Rose2", 30, 44, "red", 8);
        korzinochka.addFlower(flwr7);

        System.out.println("Our bouquet after adding flowers");
        System.out.println(korzinochka);

        System.out.println("General price-->");
        System.out.println(korzinochka.returnPrice());

        korzinochka.sortByFresh();
        System.out.println("Sorting all flowers by fresh...");
        System.out.println(korzinochka);

        System.out.println("Finding flower by size...");
        System.out.println(korzinochka.findFlower(1,10));
    }
}
