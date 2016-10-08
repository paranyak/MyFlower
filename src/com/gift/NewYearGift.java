package com.gift;

public class NewYearGift {
    private int max = 16;

    private Sweets[] gift = new Sweets[max];

    private int lastIndex = 0;

    public void addSweet(Sweets nw) {
        if (max - 1 < lastIndex) {
            Sweets[] sweetses = new Sweets[max * 2];
            for (int i = 0; i < max; i++) {
                sweetses[i] = gift[i];
            }
            max = max * 2;
            gift = sweetses;
        }
        gift[lastIndex] = nw;
        lastIndex++;
    }

    public String toString() {
        String ret = "";
        for (int i = 0; i < lastIndex; i++) {
            ret += gift[i].toString();
            ret += " ";
        }
        return ret;
    }

    public double returnWeight() {
        double general_weight = 0;
        for (int i = 0; i < lastIndex; i++) {
            general_weight += gift[i].getWeight();
        }
        return general_weight;
    }
    public void sortByWeight() {
        for (int i = 1; i <= lastIndex; i++) {
            Sweets tmp = gift[i];
            int j = i - 1;
            while (j > 0 && (gift[j].getWeight() < gift[j - 1].getWeight())) {
                tmp = gift[j - 1];
                gift[j - 1] = gift[j];
                gift[j] = tmp;
                j--;
            }
        }
    }
    public void sortBySugar() {
        for (int i = 1; i <= lastIndex; i++) {
            Sweets tmp = gift[i];
            int j = i - 1;
            while (j > 0 && (gift[j].getSugar() < gift[j - 1].getSugar())) {
                tmp = gift[j - 1];
                gift[j - 1] = gift[j];
                gift[j] = tmp;
                j--;
            }
        }
    }
    public String findCandy(int start,int end){
        String thisCandy = "";
        System.out.println("Start: " + start + ", end: " + end);
        for(int i =0; i<= lastIndex; i++){
            if (start<=gift[i].getSugar() && gift[i].getSugar()<=end){
                thisCandy += gift[i];
                thisCandy += " has sugar ";
                thisCandy += gift[i].getSugar();
                break;
            }

        }
        return thisCandy;
    }

}
