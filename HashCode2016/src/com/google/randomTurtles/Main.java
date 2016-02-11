package com.google.randomTurtles;


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

        World.printWorldParameters();

    }
}
