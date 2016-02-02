package com.arcturusx.eatery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by bruntha on 2/1/16.
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.readFile("FoodRatingAggregated.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(String filePath) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(filePath).getFile());
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null) {
            String[] tmp = line.split("[ \t]");
        }
        br.close();
        fr.close();
    }
}
