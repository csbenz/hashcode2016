package com.google.randomTurtles;

import java.awt.Point;
import java.util.ArrayList;

public class Warehouse {
    
    private final int MIN_AMOUNT = 1;
    private final int MAX_AMOUNT = 10000;
    
    private final Point position;
    private final ArrayList<Integer> wares;
    private final int amountOfWares;
    
    public Warehouse(Point position, ArrayList<Integer> data) {
        if (data.size() < MIN_AMOUNT || data.size() > MAX_AMOUNT) {
            throw new IllegalArgumentException("Invalid amount of data");
        }
        this.position = new Point(position);
        this.wares = new ArrayList<Integer>(data);
        this.amountOfWares = data.size();
    }
    
    public Point getPosition() {
        return new Point(position);
    }
    
    /**
     * Tells whether the warehouse has stock for item.
     * @param item index of the item
     * @return
     * @throws IndexOutOfBoundsException
     */
    public boolean hasStock(int item) throws IndexOutOfBoundsException {
        return stockOfItem(item) > 0;
    }
    
    /**
     * Returns the amount of a certain item this warehouse has.
     * @param item index of the item
     * @return
     * @throws IndexOutOfBoundsException
     */
    public int stockOfItem(int item) throws IndexOutOfBoundsException {
        checkIndex(item);
        return wares.get(item);
    }
    
    /**
     * Removes an amount of items from the warehouse.
     * @param item index of the item
     * @param amount
     * @throws IndexOutOfBoundsException
     */
    public void removeItem(int item, int amount) throws IndexOutOfBoundsException {
        int currentStock = stockOfItem(item);
        if(amount < 1 || amount > currentStock) {
            throw new IndexOutOfBoundsException("Invalid amount removed");
        } else {
            int newStock = currentStock - amount;
            wares.set(item, newStock);
        }
    }
    
    /**
     * Adds an amount of items to the warehouse.
     * @param item index of the item
     * @param amount
     * @throws IndexOutOfBoundsException
     */
    public void addItem(int item, int amount) throws IndexOutOfBoundsException {
        int currentStock = stockOfItem(item);
        if (amount < 1 || amount + currentStock > MAX_AMOUNT) {
            throw new IndexOutOfBoundsException("Invalid amount removed");
        } else {
            int newStock = currentStock + amount;
            wares.set(item, newStock);
        }
    }

    private void checkIndex(int item) throws IndexOutOfBoundsException {
        if(item < 0 || item > amountOfWares) {
            throw new IndexOutOfBoundsException("Item does not exist");
        }
    }
    
}
