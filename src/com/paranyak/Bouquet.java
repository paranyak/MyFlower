package com.paranyak;

public class Bouquet {
    private int max = 16;

    private Flower[] flwr = new Flower[max];

    private int lastIndex = 0;

    public void addFlower(Flower nw) {
        if (max - 1 < lastIndex) {
            Flower[] newflwrs = new Flower[max * 2];
            for (int i = 0; i < max; i++) {
                newflwrs[i] = flwr[i];
            }
            max = max * 2;
            flwr = newflwrs;
        }
        flwr[lastIndex] = nw;
        lastIndex++;
    }

    public String toString() {
        String ret = "";
        for (int i = 0; i < lastIndex; i++) {
            ret += flwr[i].toString();
            ret += " ";
        }
        return ret;
    }

    public double returnPrice() {
        double general_price = 0;
        for (int i = 0; i < lastIndex; i++) {
            general_price += flwr[i].getPrice();
        }
        return general_price;
    }

    public void sortByFresh() {
        for (int i = 1; i <= lastIndex; i++) {
            Flower tmp = flwr[i];
            int j = i - 1;
            while (j > 0 && (flwr[j].getFresh() < flwr[j - 1].getFresh())) {
                tmp = flwr[j - 1];
                flwr[j - 1] = flwr[j];
                flwr[j] = tmp;
                j--;

            }

        }
    }
    public String findFlower(int start,int end){
        String thisFlower = "";
        System.out.println("Start: " + start + ", end: " + end);
        for(int i =0; i<= lastIndex; i++){
            if (start<=flwr[i].getSize() && flwr[i].getSize()<=end){
                thisFlower += flwr[i];
                thisFlower += " has size ";
                thisFlower += flwr[i].getSize();
                break;
            }

        }
        return thisFlower;
    }

}





