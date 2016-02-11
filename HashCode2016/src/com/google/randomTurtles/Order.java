package com.google.randomTurtles;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Simon on 11.02.2016.
 */
public class Order {
    Point position;
    int[] items;
    int size;

    public Order(Point position, int size, ArrayList<Integer> itemTypeList){
        this.position = position;
        this.size = size;
        items = new int[World.P];
        for(int i = 0; i<itemTypeList.size(); i++){

        }
    }
}
