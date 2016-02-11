package com.google.randomTurtles;

import java.util.ArrayList;


public class World {

    /**
     * Number of rows of this World
     */
    public static int rows;

    /**
     * Number of columns of this World
     */
    public static int columns;

    /**
     * Number of drones in this World
     */
    public static int D;

    /**
     * Maximum capacity (load) of the drones
     */
    public static int droneMaxLoad;

    /**
     * Number of different products
     */
    public static int P;

    /**
     * List of the weights of the P products
     */
    public static ArrayList<Integer> productWeights;

    /**
     * Number of warehouses
     */
    public static int W;

    /**
     * List of warehouse objects
     */
    public static ArrayList<Warehouse> warehouses; // --> Contains location, and product availibilities...

    /**
     * Number of customer orders
     */
    public static int C;

    /**
     * List of orders objects
     */
    public static ArrayList<Order> orders;


    public static void printWorldParameters() {
        System.out.println(rows+"");
        System.out.printf(columns+ "");
        System.out.println(D+"");
        System.out.println(droneMaxLoad+"\n");
        System.out.println(P+"");
        System.out.println(productWeights+"\n");
        System.out.println(W+"");
//        System.out.println(warehouses+"\n");
        System.out.println(C+"");
//        System.out.println(orders);
    }

}
