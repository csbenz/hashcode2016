package com.google.randomTurtles;

import java.awt.*;
import java.util.ArrayList;


public class World {

    public int rows; // of the World
    public int columns; // of the World
    public int D; // Drone Number
    public long deadline; // Maximum number of Turns of the simulation
    public int droneMaxLoad; //

    public static int P; // Number of different Products
    public ArrayList<Integer> productWeights;

    public static int W; // Number of Warehouses
    public ArrayList<Warehouse> warehouses; // --> Contains location, and product availibilities...

    public static int C; // Number of Orders
    public ArrayList<Order> orders;

}
