package com.google.randomTurtles;

public class Item {

    public static int counter = 0;

    public int id;
    public int type;
    public int[] score;
    public Warehouse warehouse;
    public boolean isAssigned;

    public Item(int type) {
        this.type = type;
        id = counter++;
    }
}
