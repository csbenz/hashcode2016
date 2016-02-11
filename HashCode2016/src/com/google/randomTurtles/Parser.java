package com.google.randomTurtles;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {

    public static void parse(String fileName) {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String firstLine = br.readLine();
            String[] worldVariables = firstLine.split(" ");
            World.rows = Integer.parseInt(worldVariables[0]);
            World.columns = Integer.parseInt(worldVariables[1]);
            World.D = Integer.parseInt(worldVariables[2]);
            Main.deadline = Integer.parseInt(worldVariables[3]);
            World.droneMaxLoad = Integer.parseInt(worldVariables[4]);


            int P = Integer.parseInt(br.readLine());
            World.P = P;

            String[] productWeights = br.readLine().split(" ");
            ArrayList<Integer> weights = new ArrayList<>();
            for (int i = 0; i < productWeights.length; i++) {
                weights.add(Integer.valueOf(productWeights[i]));
            }
            World.productWeights = weights;

            int W = Integer.parseInt(br.readLine());
            World.W = W;

            ArrayList<Warehouse> warehouses = new ArrayList<>();
            for (int i = 0; i < W; i++) {
                String[] location = br.readLine().split(" ");
                int row = Integer.parseInt(location[0]);
                int column = Integer.parseInt(location[1]);

                String[] availableItemsArray = br.readLine().split(" ");
                int[] availableItemsArrayInt = stringArrayToInt(availableItemsArray);

                Warehouse warehouse = new Warehouse(new Point(row, column), availableItemsArrayInt);
                warehouses.add(warehouse);
            }
            World.warehouses = warehouses;

            int C = Integer.parseInt(br.readLine());
            ArrayList<Order> orders = new ArrayList<>();
            for (int i = 0; i < C; i++) {
                String[] location = br.readLine().split(" ");
                int row = Integer.parseInt(location[0]);
                int column = Integer.parseInt(location[1]);

                int Li = Integer.parseInt(br.readLine());

                String[] productTypes = br.readLine().split(" ");
                ArrayList<Integer> productTypesInt = stringArrayToIntList(productTypes);

                Order order = new Order(new Point(row, column), Li, productTypesInt);
                orders.add(order);
            }
            World.orders = orders;

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    private static int[] stringArrayToInt(String[] strings) {
        final int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }

    private static ArrayList<Integer> stringArrayToIntList(String[] strings) {
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            ints.add(Integer.parseInt(strings[i]));
        }
        return ints;
    }

}
