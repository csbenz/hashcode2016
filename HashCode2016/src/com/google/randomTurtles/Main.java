package com.google.randomTurtles;


import java.util.ArrayList;

public class Main {
    /**
     * Maximum number of turns of the simulation
     */
    public static long deadline;

    public static void main(String[] args) {

        String file1 = "busy_day.in";
        String file2 = "mother_of_all_warehouses.in";
        String file3 = "redundancy.in";

        Parser.parse(file2);

//        World.printWorldParameters();
        go();

    }


    private static void go() {
        for (Order o : World.orders) {
            int actualMin = Integer.MAX_VALUE;
            for (int productType : o.items) {
                int index = getMin(World.inventory);
                actualMin = index;

                do {
                    if (World.inventory.get(index).type == productType && World.inventory.get(index).isAssigned) {
                        o.assign(World.inventory.get(index));
                    }
                } while (index != -1);
            }
        }
    }

    private static int getMin(ArrayList<Item> inventory, int actualMin) {
        int actualMinNew = actualMin;
        for (Item item : inventory) {
            for(int i = 0; i < item.score.length; i++) {
                if (sc < actualMin) {
                    actualMinNew = sc;
                }
            }
        }

        return actualMinNew;
    }

    private static void computeInstruction(Item item) {

    }
}
