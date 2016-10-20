package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 10/18/2016.
 */

public enum FlowerColor {
    BLACK, RED, WHITE, PINK, GREEN;
    public String toString(){
        String a = "";
        switch (this){
            case GREEN: a = "Green color"; break;
            case BLACK: a = "Black color"; break;
            case RED: a = "Red color"; break;
            case WHITE: a = "White color"; break;
            case PINK: a = "Pink color"; break;
        }
        return a;
    }
}
