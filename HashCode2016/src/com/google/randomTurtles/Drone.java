package com.google.randomTurtles;

import javax.swing.text.Position;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

/**
 * Created by Simon on 11.02.2016.
 */
public class Drone {
    ArrayList<Item> itemList;
    ArrayList<Point> locations;
    Point actualPosition;
    int capacity;
    int actualWeight;

    public Drone(Point position, int capacity){
        this.actualPosition = position;
        this.capacity = capacity;
    }

    public void assign(Item item){
        itemList.add(item);
        actualWeight += World.productWeights.get(item.type);
    }

    public boolean isNotFull(Item e){
        return (actualWeight + World.productWeights.get(e.type)) <= capacity;
    }

    public int computeTotalInstruction(){
        int instr = 0;
        for(Item item : itemList){
            Point p = item.warehouse.getPosition();
            if(!locations.contains(p)){
                locations.add(p);
            }
        }
        int []dist = new int[locations.size()];

        for(int i = 0; i<dist.length; i++){
            dist[i] = (int)actualPosition.distance(locations.get(i));
        }
        
    }
}
