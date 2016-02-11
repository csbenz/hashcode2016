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

            for (int i = 0; i < W; i++) {
                String[] location = br.readLine().split(" ");
                int row = Integer.parseInt(location[0]);
                int column = Integer.parseInt(location[1]);
                // TODO set r c
                String[] availableItemsArray = br.readLine().split(" ");
                // TODO loop and set

//                Warehouse warehouse = new Warehouse(new Point(row, column),)
            }

            int C = Integer.parseInt(br.readLine());
            for (int i = 0; i < C; i++) {
                String[] location = br.readLine().split(" ");
                int row = Integer.parseInt(location[0]);
                int column = Integer.parseInt(location[1]);

                int Li = Integer.parseInt(br.readLine());
                // TODO set ordered numbers for order i: Li
                String[] productTypes = br.readLine().split(" ");
                // TODO loop and set
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

}
