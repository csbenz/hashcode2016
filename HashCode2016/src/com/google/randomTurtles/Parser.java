package com.google.randomTurtles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Parser {

    public void parse() throws IOException {
        String path = "logo.in";
        File file = new File(path);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            if ((line = br.readLine()) != null) {
                String pattern = "() ()";
                Pattern p = Pattern.compile(pattern);
                String[] linCol = p.split(line);
                System.out.println(linCol[1]);
            }
            while ((line = br.readLine()) != null) {
                // process the line.
//                count = line.;
            }
        }
    }
}
