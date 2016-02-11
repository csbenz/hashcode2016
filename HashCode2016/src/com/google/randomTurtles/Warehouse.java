package com.google.randomTurtles;

import java.awt.Point;

public class Warehouse {
    
    private final int MIN_AMOUNT = 1;
    private final int MAX_AMOUNT = 10000;
    
    private final Point position;
    private final int[] wares;
    private final int amountOfWares;
    
    public Warehouse(Point position, int[] data) {
        if (data.length < 1 || data.length > 10000) {
            throw new IllegalArgumentException("Invalid amount of data");
        }
        this.position = new Point(position);
        this.wares = data.clone();
        this.amountOfWares = data.length;
    }
    
    public Point getPosition() {
        return new Point(position);
    }
    
    public boolean hasStock(int item) throws IndexOutOfBoundsException {
        return stockOfItem(item) > 0;
    }
    
    public int stockOfItem(int item) throws IndexOutOfBoundsException {
        checkIndex(item);
        
        return wares[item];
    }
    
    public void removeItem(int item, int amount) throws IndexOutOfBoundsException {
        int currentStock = stockOfItem(item);
        if(amount < 1 || amount > currentStock) {
            throw new IndexOutOfBoundsException("Invalid amount removed");
        } else {
            int newStock = currentStock - amount;
            wares[item] = newStock;
        }
    }
    
    public void addItem(int item, int amount) throws IndexOutOfBoundsException {
        int currentStock = stockOfItem(item);
        if (amount < 1 || amount + currentStock > MAX_AMOUNT) {
            throw new IndexOutOfBoundsException("Invalid amount removed");
        } else {
            int newStock = currentStock + amount;
            wares[item] = newStock;
        }
    }

    private void checkIndex(int item) throws IndexOutOfBoundsException {
        if(item < 0 || item > amountOfWares) {
            throw new IndexOutOfBoundsException("Item does not exist");
        }
    }
    
}
