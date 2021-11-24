package com.tap.algos;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Utils {
    public static int[] generateArray(int n) {
        int[] generatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newRandomInt = new Random().nextInt(10000);
            generatedArray[i] = newRandomInt;
        }
        return generatedArray;
    }

    public static String[] generateStringArray(int n) {
        String[] generatedArray = new String[50];

        for (int i = 0; i < 50; i++) {
            byte[] array = new byte[7];
            new Random().nextBytes(array);
            String generatedString = new String(array, StandardCharsets.UTF_8);
            generatedArray[i] = generatedString;
        }
        return generatedArray;
    }
}
