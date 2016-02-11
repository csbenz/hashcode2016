package com.google.randomTurtles;


public class Main {
    public static void main(String[] args) {

        String file1 = "busy_day.in";
        String file2 = "mother_of_all_warehouses.in";
        String file3 = "redundancy.in";

        Parser.parse(file1);

        World.printWorldParameters();

    }
}
