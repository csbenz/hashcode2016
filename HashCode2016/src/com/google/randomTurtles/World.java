package com.google.randomTurtles;

import java.awt.*;
import java.util.ArrayList;


public class World {

    /**
     * Number of rows of this World
     */
    public static int rows;

    /**
     * Number of columns of this World
     */
    public static int columns; // of the World

    /**
     *
     */
    public static int D; // Drone Number
    public static long deadline; // Maximum number of Turns of the simulation
    public static int droneMaxLoad; //

    /**
     * Number of different products
     */
    public static int P; // Number of different Products
    public static ArrayList<Integer> productWeights;

    /**
     * Number of warehouses
     */
    public static int W; // Number of Warehouses
    public static ArrayList<Warehouse> warehouses; // --> Contains location, and product availibilities...

    /**
     * Number of customer orders
     */
    public static int C; // Number of Orders
    public static ArrayList<Order> orders;

}
