package com.google.randomTurtles;

import java.awt.*;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

/**
 * Created by Simon on 11.02.2016.
 */
public class Order {
    Point position;
    int[] items;
    int size;
    
    LinkedList<Integer> assignments;

    public Order(Point position, int size, ArrayList<Integer> itemTypeList){
        this.position = position;
        if(position.x<0 || position.y<0){
            throw new IllegalArgumentException("Position is invalid");
        }
        this.size = size;
        items = new int[World.P];
        for(int i = 0; i<itemTypeList.size(); i++){
            items[itemTypeList.get(i)] += 1;
        }
        
        this.assignments = new LinkedList<>();
    }

    @Override
    public String toString(){
        String loc = "Location = "+position.toString();
        String itemStr = "Items : ";
        for(int i = 0; i<items.length;i++){
            itemStr += ";"+items[i];
        }
        String tot = "Number of items : "+size;
        return loc+" "+itemStr+" "+tot;
    }
    
    public void assign(Item item) {
        item.assign(this);
        this.assignments.add(item);
    }

    /**
     * Returns an array containing the number of product per product type.
     * @return array of product.
     */
    public int[] getItems(){
        return items.clone();
    }

    /**
     * Returns the total number of items in the order.
     * @return the total number of items in the order.
     */
    public int getSize(){
        return size;
    }

    /**
     * Get the delivery position of the order.
     * @return the delivery position
     */
    public Point getDeliveryPosition(){
        return new Point(position.x,position.y);
    }
}
