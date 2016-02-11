package com.google.randomTurtles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Parser {

    public static void parse(String fileName) {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String firstLine = br.readLine();
            String[] firstSplitted = firstLine.split(" ");
            // TODO set variables in World

            int P = Integer.parseInt(br.readLine());
            // TODO set orders
            String[] productWeights = br.readLine().split(" ");
            for (int i = 0; i < productWeights.length; i++) {
                // TODO set each product weight
            }

            int W = Integer.parseInt(br.readLine());
            // TODO set W
            for (int i = 0; i < W; i++) {
                String[] location = br.readLine().split(" ");
                int row = Integer.parseInt(location[0]);
                int column = Integer.parseInt(location[1]);
                // TODO set r c
                String[] availableItemsArray = br.readLine().split(" ");
                // TODO loop and set
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
